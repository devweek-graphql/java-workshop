// package com.dev.week.devweek.graphql.resolvers.mutations;

// import com.dev.week.devweek.commons.model.Team;
// import com.dev.week.devweek.commons.services.ITeamService;
// import com.dev.week.devweek.graphql.models.AddTeamPayload;

// import org.springframework.stereotype.Component;

// import graphql.kickstart.tools.GraphQLMutationResolver;

// @Component
// public class TeamMutationResolver implements GraphQLMutationResolver {
    
//     private final ITeamService teamService;
    
//     public TeamMutationResolver(ITeamService teamService) {
//         this.teamService = teamService;
//     }

//     public Team addNewTeam(AddTeamPayload payload) {
//         return this.teamService.addNewTeam(payload);
//     }
// }
