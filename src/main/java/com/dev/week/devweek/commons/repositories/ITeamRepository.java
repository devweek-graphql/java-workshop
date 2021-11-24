package com.dev.week.devweek.commons.repositories;

import com.dev.week.devweek.commons.model.Team;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamRepository extends JpaRepository<Team, String> {
    
}
