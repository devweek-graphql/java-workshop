package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.model.Team;
import com.dev.week.devweek.graphql.models.AddTeamPayload;

public interface ITeamService {
    
    List<Team> getAllTeams();

    Team addNewTeam(AddTeamPayload payload);
}
