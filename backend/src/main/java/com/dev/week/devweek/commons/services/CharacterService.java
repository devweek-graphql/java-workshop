package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;
import com.dev.week.devweek.commons.model.Ability;
import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.model.FirstAppearance;
import com.dev.week.devweek.commons.model.IAddCharacter;
import com.dev.week.devweek.commons.model.IUpdateCharacter;
import com.dev.week.devweek.commons.model.Team;
import com.dev.week.devweek.commons.repositories.IAbilityRepository;
import com.dev.week.devweek.commons.repositories.ICharacterRepository;
import com.dev.week.devweek.commons.repositories.IFirstAppearanceRepository;
import com.dev.week.devweek.commons.repositories.ITeamRepository;
import com.dev.week.devweek.rest.model.CharacterRequest;
import com.dev.week.devweek.rest.model.CharacterUpdateRequest;

import org.apache.coyote.http11.InputFilter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
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
        return StringUtils.hasText(characterId) 
            ? this.characterRepository.findById(characterId).orElse(null)
            : null;
    }

    @Override
    public Character addNewCharacter(IAddCharacter request) {
        if (request != null) {
            List<Character> alies = !CollectionUtils.isEmpty(request.getAlliesIds()) 
                ? this.characterRepository.findAllById(request.getAlliesIds())
                : null;
            List<Team> teamsIsPartOf = !CollectionUtils.isEmpty(request.getPartOfIds()) 
                ? this.teamRepository.findAllById(request.getPartOfIds())
                : null;
            FirstAppearance firstAppearance = StringUtils.hasText(request.getFirstAppearanceId())
                ? this.firstAppearanceRepository.findById(request.getFirstAppearanceId()).orElse(null)
                : null;
            List<Ability> abilities = !CollectionUtils.isEmpty(request.getAbilitiesIds()) 
                ? this.abilityRepository.findAllById(request.getAbilitiesIds())
                : null;
            
            Character character = new Character();
            character.setName(request.getName());
            character.setUniverse(request.getUniverse());
            character.setType(request.getType());
            character.setAllies(alies);
            character.setPartOf(teamsIsPartOf);
            character.setFirstAppearance(firstAppearance);
            character.setAbilities(abilities);

            return this.characterRepository.saveAndFlush(character);
        }

        return null;
    }

    @Override
    public Character updateCharacter(String characterId, IUpdateCharacter updateRequest) {
        Character character = null; 
        if (updateRequest != null) {
            character = this.characterRepository.findById(characterId).orElse(null);
            if (character != null) {
                List<Character> aliesToAdd = !CollectionUtils.isEmpty(updateRequest.getAlliesIdsToAdd())
                    ? this.characterRepository.findAllById(updateRequest.getAlliesIdsToAdd())
                    : null;
                FirstAppearance firstAppearance = StringUtils.hasText(updateRequest.getFirstAppearanceId())
                    ? this.firstAppearanceRepository.findById(updateRequest.getFirstAppearanceId()).orElse(null)
                    : null;
                List<Team> teamsIsPartOfToAdd = !CollectionUtils.isEmpty(updateRequest.getPartOfIdsToAdd())
                    ? this.teamRepository.findAllById(updateRequest.getPartOfIdsToAdd())
                    : null;
                List<Ability> abilitiesToAdd = !CollectionUtils.isEmpty(updateRequest.getAbilitiesIdsToAdd())
                    ? this.abilityRepository.findAllById(updateRequest.getAbilitiesIdsToAdd())
                    : null;

                aliesToAdd.addAll(character.getAllies());
                teamsIsPartOfToAdd.addAll(character.getPartOf());
                abilitiesToAdd.addAll(character.getAbilities());

                character.setAllies(aliesToAdd);
                character.setPartOf(teamsIsPartOfToAdd);
                character.setAbilities(abilitiesToAdd);
                character.setFirstAppearance(firstAppearance);
                character.setUniverse(updateRequest.getUniverse());
                character.setType(updateRequest.getType());
                character = this.characterRepository.saveAndFlush(character);
            }
        }

        return character;
    }

    @Override
    public String deleteCharacter(String characterId) {
        if (StringUtils.hasText(characterId)) {
            this.characterRepository.deleteById(characterId);
            return characterId;
        }

        return null;
    }
}
