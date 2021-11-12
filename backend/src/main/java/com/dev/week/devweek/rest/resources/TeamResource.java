package com.dev.week.devweek.rest.resources;

import java.util.List;

import com.dev.week.devweek.commons.model.Team;
import com.dev.week.devweek.commons.services.ITeamService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/teams")
public class TeamResource {
    
    private final ITeamService teamService;

    public TeamResource(ITeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return this.teamService.getAllTeams();
    }
}
