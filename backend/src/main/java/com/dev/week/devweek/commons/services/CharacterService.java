package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.repositories.ICharacterRepository;

import org.springframework.stereotype.Service;

@Service
public class CharacterService implements ICharacterService {
    
    private ICharacterRepository characterRepository;

    public CharacterService(ICharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<Character> getAllCharacters() {
        return this.characterRepository.findAll();
    }
}
