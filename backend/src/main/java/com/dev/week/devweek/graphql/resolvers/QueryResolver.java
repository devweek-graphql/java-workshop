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
public class QueryResolver implements GraphQLQueryResolver  {
    
    private final IAbilityService abilityService;
    private final ICharacterService characterService;
    private final IFirstAppearanceService firstAppearanceService;
    private final ITeamService teamService;
    
    public QueryResolver(
            IAbilityService abilityService, 
            ICharacterService characterService,
            IFirstAppearanceService firstAppearanceService, 
            ITeamService teamService) {
        this.abilityService = abilityService;
        this.characterService = characterService;
        this.firstAppearanceService = firstAppearanceService;
        this.teamService = teamService;
    }

    public List<Ability> getAllAbilities() {
        return this.abilityService.getAllAbilities();
    }
    
}
