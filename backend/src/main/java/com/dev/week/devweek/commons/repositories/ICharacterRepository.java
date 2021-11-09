package com.dev.week.devweek.commons.repositories;

import com.dev.week.devweek.commons.model.Character;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICharacterRepository extends JpaRepository<Character, String> {
    
    @Query(
        value = "SELECT * FROM CHARACTERS WHERE UNIVERSE = ?1",
        countQuery = "SELECT COUNT(*) FROM CHARACTERS WHERE UNIVERSE = ?1",
        nativeQuery = true
    )
    Page<Character> getCharactersByUniverse(String universe, Pageable pageable);

}
