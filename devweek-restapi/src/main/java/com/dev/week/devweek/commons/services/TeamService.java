package com.dev.week.devweek.commons.services;

import java.util.List;

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
    public List<Team> getAllTeams() {
        return this.teamRepository.findAll();
    }
    
}
