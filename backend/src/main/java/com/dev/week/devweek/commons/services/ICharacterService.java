package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.rest.model.CharacterRequest;
import com.dev.week.devweek.rest.model.CharacterUpdateRequest;

public interface ICharacterService {
    
    List<Character> getCharactersWithFilters (CharacterUniverseEnum universe,
        String sortBy, String order, Integer limit, Integer offset);

    Character getCharacterById(String characterId);

    Character addNewCharacter(CharacterRequest request);

    Character updateCharacter(String characterId, CharacterUpdateRequest updateRequest);

    void deleteCharacter(String characterId);
}
