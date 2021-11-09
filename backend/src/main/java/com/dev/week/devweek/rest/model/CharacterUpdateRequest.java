package com.dev.week.devweek.rest.model;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public class CharacterUpdateRequest {
    
    private CharacterUniverseEnum universe;

    private CharacterTypeEnum type;

    private List<String> aliesIdsToAdd;

    private List<String> partOfIdsToAdd;

    private Integer firstAppearanceId;

    private List<String> abilitiesNamesToAdd;

    public CharacterUniverseEnum getUniverse() {
        return universe;
    }

    public void setUniverse(CharacterUniverseEnum universe) {
        this.universe = universe;
    }

    public CharacterTypeEnum getType() {
        return type;
    }

    public void setType(CharacterTypeEnum type) {
        this.type = type;
    }

    public List<String> getAliesIdsToAdd() {
        return aliesIdsToAdd;
    }

    public void setAliesIdsToAdd(List<String> aliesIdsToAdd) {
        this.aliesIdsToAdd = aliesIdsToAdd;
    }

    public List<String> getPartOfIdsToAdd() {
        return partOfIdsToAdd;
    }

    public void setPartOfIdsToAdd(List<String> partOfIdsToAdd) {
        this.partOfIdsToAdd = partOfIdsToAdd;
    }

    public Integer getFirstAppearanceId() {
        return firstAppearanceId;
    }

    public void setFirstAppearanceId(Integer firstAppearanceId) {
        this.firstAppearanceId = firstAppearanceId;
    }

    public List<String> getAbilitiesNamesToAdd() {
        return abilitiesNamesToAdd;
    }

    public void setAbilitiesNamesToAdd(List<String> habilitiesNamesToAdd) {
        this.abilitiesNamesToAdd = habilitiesNamesToAdd;
    }
}
