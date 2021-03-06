package com.dev.week.devweek.rest.model;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public class CharacterUpdateRequest {
    
    private CharacterUniverseEnum universe;

    private CharacterTypeEnum type;

    private List<String> alliesIdsToAdd;

    private List<String> partOfIdsToAdd;

    private String firstAppearanceId;

    private List<String> abilitiesIdsToAdd;

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

    public List<String> getAlliesIdsToAdd() {
        return alliesIdsToAdd;
    }

    public void setAlliesIdsToAdd(List<String> aliesIdsToAdd) {
        this.alliesIdsToAdd = aliesIdsToAdd;
    }

    public List<String> getPartOfIdsToAdd() {
        return partOfIdsToAdd;
    }

    public void setPartOfIdsToAdd(List<String> partOfIdsToAdd) {
        this.partOfIdsToAdd = partOfIdsToAdd;
    }

    public String getFirstAppearanceId() {
        return firstAppearanceId;
    }

    public void setFirstAppearanceId(String firstAppearanceId) {
        this.firstAppearanceId = firstAppearanceId;
    }

    public List<String> getAbilitiesIdsToAdd() {
        return abilitiesIdsToAdd;
    }

    public void setAbilitiesIdsToAdd(List<String> abilitiesIdsToAdd) {
        this.abilitiesIdsToAdd = abilitiesIdsToAdd;
    }
}
