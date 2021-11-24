package com.dev.week.devweek.graphql.resolvers.queries;

import java.util.List;

import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.services.ICharacterService;
import com.dev.week.devweek.graphql.models.GetCharactersFilters;

import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class CharacterQueryResolver implements GraphQLQueryResolver {
    
    private final ICharacterService characterService;
    
    public CharacterQueryResolver(ICharacterService characterService) {
        this.characterService = characterService;
    }

    public List<Character> getCharacters(GetCharactersFilters filters) {
        if (filters != null) {
            String order = null;
            if (filters.getOrder() != null) {
                order = filters.getOrder().toString();
            }
            return this.characterService.getCharactersWithFilters(
                filters.getUniverse(), filters.getSortBy(), order, filters.getLimit(), filters.getOffset());
        }

        return this.characterService.getCharactersWithFilters(null, null, null, null, null);
    }

    public Character getCharacterById(String id) {
        return this.characterService.getCharacterById(id);
    }
}
