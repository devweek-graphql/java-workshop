package com.dev.week.devweek.graphql.resolvers.queries;

import java.util.List;

import com.dev.week.devweek.commons.model.Team;
import com.dev.week.devweek.commons.services.ITeamService;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class TeamQueryResolver implements GraphQLQueryResolver {
    
    private final ITeamService teamService;
    
    public TeamQueryResolver(ITeamService teamService) {
        this.teamService = teamService;
    }

    public List<Team> getAllTeams() {
        return this.teamService.getAllTeams();
    }  
}
