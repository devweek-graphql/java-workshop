package com.dev.week.devweek.commons.repositories;

import com.dev.week.devweek.commons.model.FirstAppearance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IFirstAppearanceRepository extends JpaRepository<FirstAppearance, String> {
    
}
