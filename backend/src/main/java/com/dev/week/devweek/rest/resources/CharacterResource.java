package com.dev.week.devweek.rest.resources;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.services.ICharacterService;
import com.dev.week.devweek.rest.model.CharacterRequest;
import com.dev.week.devweek.rest.model.CharacterUpdateRequest;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",
        methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
                RequestMethod.OPTIONS, RequestMethod.PATCH})
@RestController
@RequestMapping(value="/characters")
public class CharacterResource {
    
    private ICharacterService characterService;

    public CharacterResource (ICharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getCharactersWithFilters (
        @RequestParam(name = "universe", required = false) CharacterUniverseEnum universe,
        @RequestParam(name = "sortBy", required = false) String sortBy,
        @RequestParam(name = "order", required = false) String order,
        @RequestParam(name = "limit", required = false) Integer limit,
        @RequestParam(name = "offset", required = false) Integer offset) {

        return this.characterService.getCharactersWithFilters(universe, sortBy, order, limit, offset);
    }

    @GetMapping("/{characterId}")
    public Character getCharacterById(@PathVariable String characterId) {
        return this.characterService.getCharacterById(characterId);
    }

    @PostMapping
    public Character addNewCharacter(@RequestBody CharacterRequest bodyRequest) {
        return this.characterService.addNewCharacter(bodyRequest);
    }

    @PutMapping("/{characterId}")
    public Character updateCharacter(
        @PathVariable String characterId, @RequestBody CharacterUpdateRequest updateRequest) {
        return this.characterService.updateCharacter(characterId, updateRequest);
    }

    @DeleteMapping("/{characterId}")
    public String deleteCharacter(@PathVariable String characterId) {
        return this.characterService.deleteCharacter(characterId);
    }
}
