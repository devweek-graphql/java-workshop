package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.model.IAddCharacter;
import com.dev.week.devweek.commons.model.IUpdateCharacter;

public interface ICharacterService {
    
    List<Character> getCharactersWithFilters (CharacterUniverseEnum universe,
        String sortBy, String order, Integer limit, Integer offset);

    Character getCharacterById(String characterId);

    Character  addNewCharacter(IAddCharacter request);

    Character updateCharacter(String characterId, IUpdateCharacter updateRequest);

    String deleteCharacter(String characterId);
}
