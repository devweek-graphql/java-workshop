package com.dev.week.devweek.commons.repositories;

import com.dev.week.devweek.commons.model.Ability;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbilityRepository extends JpaRepository<Ability, String> {
    
}
