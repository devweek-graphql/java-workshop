package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Ability;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.model.FirstAppearance;
import com.dev.week.devweek.commons.model.Team;
import com.dev.week.devweek.commons.repositories.IAbilityRepository;
import com.dev.week.devweek.commons.repositories.ICharacterRepository;
import com.dev.week.devweek.commons.repositories.IFirstAppearanceRepository;
import com.dev.week.devweek.commons.repositories.ITeamRepository;
import com.dev.week.devweek.rest.model.CharacterRequest;
import com.dev.week.devweek.rest.model.CharacterUpdateRequest;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CharacterService implements ICharacterService {

    private final ICharacterRepository characterRepository;
    private final ITeamRepository teamRepository;
    private final IFirstAppearanceRepository firstAppearanceRepository;
    private final IAbilityRepository abilityRepository;

    private final String DEFAULT_SORT_COLUMN = "name";

    public CharacterService(ICharacterRepository characterRepository,
        ITeamRepository teamRepository, 
        IFirstAppearanceRepository firstAppearanceRepository,
        IAbilityRepository abilityRepository) {
        this.characterRepository = characterRepository;
        this.teamRepository = teamRepository;
        this.firstAppearanceRepository = firstAppearanceRepository;
        this.abilityRepository = abilityRepository;
    }

    @Override
    public List<Character> getCharactersWithFilters(CharacterUniverseEnum universe, String sortBy, String order, Integer limit, Integer offset) {
        Sort sorting = Sort
            .by(StringUtils.hasText(order) ? Direction.fromString(order) : Direction.ASC,
                StringUtils.hasText(sortBy) ? sortBy : DEFAULT_SORT_COLUMN);
        Pageable pageable = PageRequest.of(offset != null ? offset - 1 : 0, limit != null ? limit : Integer.MAX_VALUE, sorting);
        
        return universe == null 
            ? this.characterRepository.findAll(pageable).getContent()
            : this.characterRepository.getCharactersByUniverse(universe.toString(), pageable).getContent();
    }

    @Override
    public Character getCharacterById(String characterId) {
        return this.characterRepository.findById(characterId).orElse(null);
    }

    @Override
    public Character addNewCharacter(CharacterRequest request) {
        if (request != null) {
            List<Character> alies = this.characterRepository.findAllById(request.getAliesNames());
            List<Team> teamsIsPartOf = this.teamRepository.findAllById(request.getPartOfIds());
            FirstAppearance firstAppearance = this.firstAppearanceRepository.findById(request.getFirstAppearanceId()).orElse(null);
            List<Ability> abilities = this.abilityRepository.findAllById(request.getAbilitiesNames());
            
            Character character = new Character();
            character.setName(request.getName());
            character.setUniverse(request.getUniverse());
            character.setType(request.getType());
            character.setAllies(alies);
            // character.setPartOf(teamsIsPartOf); TODO
            character.setFirstAppearance(firstAppearance);
            character.setAbilities(abilities);

            return this.characterRepository.saveAndFlush(character);
        }

        return null;
    }

    @Override
    public Character updateCharacter(String characterId, CharacterUpdateRequest updateRequest) {
        Character character = null; 
        if (updateRequest != null) {
            character = this.characterRepository.findById(characterId).orElse(null);
            if (character != null) {
                List<Character> aliesToAdd = this.characterRepository.findAllById(updateRequest.getAliesIdsToAdd());
                List<Team> teamsIsPartOfToAdd = this.teamRepository.findAllById(updateRequest.getPartOfIdsToAdd());
                List<Ability> abilitiesToAdd = this.abilityRepository.findAllById(updateRequest.getAbilitiesNamesToAdd());

                // List<Character> existingAliesFiltered = character.getAlies()
                //     .stream()
                //     .filter(alie -> !updateRequest.getAliesIdsToDelete().contains(alie.getName()))
                //     .collect(Collectors.toList());
                // List<Team> existingTeamsFiltered = character.getPartOf()
                //     .stream()
                //     .filter(team -> !updateRequest.getPartOfIdsDelete().contains(team.getName()))
                //     .collect(Collectors.toList());
                // List<Ability> existingAbilitiesFiltered = character.getAbilities()
                //     .stream()
                //     .filter(ability -> !updateRequest.getAbilitiesNamesToDelete().contains(ability.getName()))
                //     .collect(Collectors.toList());

                aliesToAdd.addAll(character.getAllies());
                // teamsIsPartOfToAdd.addAll(character.getPartOf()); TODO
                abilitiesToAdd.addAll(character.getAbilities());

                character.setAllies(aliesToAdd);
                // character.setPartOf(teamsIsPartOfToAdd); TODO
                character.setAbilities(abilitiesToAdd);
                character.setUniverse(updateRequest.getUniverse());
                character.setType(updateRequest.getType());
                character = this.characterRepository.saveAndFlush(character);
                
            }
        }

        return character;
    }

    @Override
    public void deleteCharacter(String characterId) {
        this.characterRepository.deleteById(characterId);
    }
    
}
