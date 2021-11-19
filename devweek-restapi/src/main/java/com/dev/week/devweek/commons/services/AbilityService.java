package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.model.Ability;
import com.dev.week.devweek.commons.repositories.IAbilityRepository;

import org.springframework.stereotype.Service;

@Service
public class AbilityService implements IAbilityService {

    private final IAbilityRepository abilityRepository;

    public AbilityService(IAbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    @Override
    public List<Ability> getAllAbilities() {
        return this.abilityRepository.findAll();
    }
    
}
