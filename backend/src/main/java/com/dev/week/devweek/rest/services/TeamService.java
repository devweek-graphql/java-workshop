package com.dev.week.devweek.rest.services;

import com.dev.week.devweek.commons.model.Team;
import com.dev.week.devweek.commons.repositories.ITeamRepository;

import org.springframework.stereotype.Service;

@Service
public class TeamService implements ITeamService {

    private final ITeamRepository teamRepository;

    public TeamService(ITeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team getTeamById(String teamId) {
        return this.teamRepository.findById(teamId).orElse(null);
    }
    
}
