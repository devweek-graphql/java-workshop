package com.dev.week.devweek.rest.resources;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.services.ICharacterService;
import com.dev.week.devweek.rest.model.CharacterRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/characters")
public class CharacterResource {
    
    private ICharacterService characterService;

    public CharacterResource (ICharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getAllCaracters (
        @RequestParam(name = "universe", required = false) CharacterUniverseEnum universe,
        @RequestParam(name = "sortBy", required = false) String sortBy,
        @RequestParam(name = "order", required = false) String order,
        @RequestParam(name = "limit", required = false) Integer limit,
        @RequestParam(name = "offset", required = false) Integer offset) {

        return null;
    }

    @GetMapping("/{characterId}")
    public Character getCharacterById(@PathVariable String characterId) {
        return null;
    }

    @PostMapping
    public Character addNewCharacter(@RequestBody CharacterRequest bodyRequest) {
        return null;
    }

    @PutMapping("/{characterId}")
    public Character updateCharacter(@PathVariable String characterId) {
        return null;
    }

    @DeleteMapping("/{characterId}")
    public ResponseEntity<Void> deleteCharacter() {
        return null;
    }
}
