// package com.dev.week.devweek.graphql.resolvers.mutations;

// import com.dev.week.devweek.commons.model.Character;
// import com.dev.week.devweek.commons.services.ICharacterService;
// import com.dev.week.devweek.graphql.models.AddCharacterPayload;
// import com.dev.week.devweek.graphql.models.UpdateCharacterPayload;

// import org.springframework.stereotype.Component;
// import org.springframework.util.StringUtils;

// import graphql.kickstart.tools.GraphQLMutationResolver;

// @Component
// public class CharacterMutationResolver implements GraphQLMutationResolver {
    
//     private final ICharacterService characterService;
    
//     public CharacterMutationResolver(ICharacterService characterService) {
//         this.characterService = characterService;
//     }

//     public Character addNewCharacter(AddCharacterPayload payload) {
//         return this.characterService.addNewCharacter(payload);
//     }

//     public Character updateCharacter(String id, UpdateCharacterPayload payload) {
//         return this.characterService.updateCharacter(id, payload);
//     }

//     public String deleteCharacter(String id) {
//         if (StringUtils.hasText(id)) {
//             this.characterService.deleteCharacter(id);
//             return id;
//         }

//         return null;
//     }
// }
