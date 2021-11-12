package com.dev.week.devweek.rest.resources;

import java.util.List;

import com.dev.week.devweek.commons.model.Ability;
import com.dev.week.devweek.commons.services.IAbilityService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/abilities")
public class AbilityResource {
    
    private final IAbilityService abilityService;

    public AbilityResource(IAbilityService abilityService) {
        this.abilityService = abilityService;
    }

    @GetMapping
    public List<Ability> getAllAbilities() {
        return this.abilityService.getAllAbilities();
    }
}
