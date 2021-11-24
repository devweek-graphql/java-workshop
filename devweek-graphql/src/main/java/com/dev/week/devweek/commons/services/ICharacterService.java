package com.dev.week.devweek.commons.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.graphql.models.AddCharacterPayload;
import com.dev.week.devweek.graphql.models.UpdateCharacterPayload;

public interface ICharacterService {
    
    List<Character> getCharactersWithFilters (CharacterUniverseEnum universe,
        String sortBy, String order, Integer limit, Integer offset);

    Character getCharacterById(String characterId);

    Character  addNewCharacter(AddCharacterPayload request);

    Character updateCharacter(String characterId, UpdateCharacterPayload updateRequest);

    String deleteCharacter(String characterId);

    Map<String, List<Character>> getCharactersFor(Set<String> characterNames);
}
