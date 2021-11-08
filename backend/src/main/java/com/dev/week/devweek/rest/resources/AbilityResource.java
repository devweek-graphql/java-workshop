package com.dev.week.devweek.rest.resources;

import javax.websocket.server.PathParam;

import com.dev.week.devweek.commons.model.Ability;
import com.dev.week.devweek.rest.services.IAbilityService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/abilities")
public class AbilityResource {
    
    private final IAbilityService abilityService;

    public AbilityResource(IAbilityService abilityService) {
        this.abilityService = abilityService;
    }

    @GetMapping("/{abilityId}")
    public Ability getAbilityByName(@PathVariable String abilityId) {
        return this.abilityService.getAbilityById(abilityId);
    }
}
