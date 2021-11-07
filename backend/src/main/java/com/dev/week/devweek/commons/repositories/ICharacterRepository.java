package com.dev.week.devweek.commons.repositories;

import com.dev.week.devweek.commons.model.Character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ICharacterRepository extends JpaRepository<Character, String> {
    
}
