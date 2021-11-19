// package com.dev.week.devweek.graphql.resolvers.types;

// import java.util.List;

// import com.dev.week.devweek.commons.model.Character;
// import com.dev.week.devweek.commons.model.Team;

// import org.springframework.stereotype.Component;
// import org.springframework.util.CollectionUtils;

// import graphql.kickstart.tools.GraphQLResolver;

// @Component
// public class CharacterTypeResolver implements GraphQLResolver<Character> {
    
//     public List<Team> partOf(Character character, Integer first) {
//         if (first != null) {
//             List<Team> characterTeams = character.getPartOf();
//             if (!CollectionUtils.isEmpty(characterTeams)) {
//                 return characterTeams.subList(0, first);
//             }
//         }
        
//         return character.getPartOf();
//     }

// }
