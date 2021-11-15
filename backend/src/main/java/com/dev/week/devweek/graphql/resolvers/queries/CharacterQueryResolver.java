package com.dev.week.devweek.graphql.resolvers.queries;

import java.util.List;

import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.services.ICharacterService;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class CharacterQueryResolver implements GraphQLQueryResolver {
    
    private final ICharacterService characterService;
    
    public CharacterQueryResolver(ICharacterService characterService) {
        this.characterService = characterService;
    }

    public List<Character> getCharacters() {
        return null;
    }

    public Character getCharacterById(String id) {
        return this.characterService.getCharacterById(id);
    }
}
