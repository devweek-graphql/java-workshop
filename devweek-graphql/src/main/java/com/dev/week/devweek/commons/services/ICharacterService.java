package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Character;

public interface ICharacterService {
    
    List<Character> getCharactersWithFilters (CharacterUniverseEnum universe,
        String sortBy, String order, Integer limit, Integer offset);

    Character getCharacterById(String characterId);

    // Character  addNewCharacter(AddCharacterPayload request);

    // Character updateCharacter(String characterId, CharacterUpdatePayload updateRequest);

    String deleteCharacter(String characterId);
}
