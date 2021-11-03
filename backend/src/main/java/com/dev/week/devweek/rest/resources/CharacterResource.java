package com.dev.week.devweek.rest.resources;

import com.dev.week.devweek.rest.services.ICharacterService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/character")
public class CharacterResource {
    
    private ICharacterService characterService;

    public CharacterResource (ICharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public void getAllCaracters () {}
}
