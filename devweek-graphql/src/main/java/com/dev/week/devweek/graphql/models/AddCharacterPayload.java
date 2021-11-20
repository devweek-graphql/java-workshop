package com.dev.week.devweek.graphql.models;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public class AddCharacterPayload {
    
    private String name;

    private CharacterUniverseEnum universe;

    private CharacterTypeEnum type;

    private List<String> alliesIds;

    private List<String> partOfIds;

    private String firstAppearanceId;

    private List<String> abilitiesIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public List<String> getAlliesIds() {
        return alliesIds;
    }

    public void setAlliesIds(List<String> alliesIds) {
        this.alliesIds = alliesIds;
    }

    public List<String> getPartOfIds() {
        return partOfIds;
    }

    public void setPartOfIds(List<String> partOfIds) {
        this.partOfIds = partOfIds;
    }

    public String getFirstAppearanceId() {
        return firstAppearanceId;
    }

    public void setFirstAppearanceId(String firstAppearanceId) {
        this.firstAppearanceId = firstAppearanceId;
    }

    public List<String> getAbilitiesIds() {
        return abilitiesIds;
    }

    public void setAbilitiesIds(List<String> abilitiesIds) {
        this.abilitiesIds = abilitiesIds;
    }

    
}
