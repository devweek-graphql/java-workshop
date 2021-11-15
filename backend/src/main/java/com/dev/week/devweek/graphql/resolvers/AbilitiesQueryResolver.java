package com.dev.week.devweek.graphql.resolvers;

import java.util.List;

import com.dev.week.devweek.commons.model.Ability;
import com.dev.week.devweek.commons.services.IAbilityService;
import com.dev.week.devweek.commons.services.ICharacterService;
import com.dev.week.devweek.commons.services.IFirstAppearanceService;
import com.dev.week.devweek.commons.services.ITeamService;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class AbilitiesQueryResolver implements GraphQLQueryResolver  {
    
    private final IAbilityService abilityService;
    
    public AbilitiesQueryResolver(IAbilityService abilityService) {
        this.abilityService = abilityService;
    }

    public List<Ability> getAllAbilities() {
        return this.abilityService.getAllAbilities();
    }
    
}
