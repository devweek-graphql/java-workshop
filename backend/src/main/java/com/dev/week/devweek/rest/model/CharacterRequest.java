package com.dev.week.devweek.rest.model;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public class CharacterRequest {
    
    private String name;

    private CharacterUniverseEnum universe;

    private CharacterTypeEnum type;

    private List<String> aliesNames;

    private List<String> partOfIds;

    private String firstAppearanceId;

    private List<String> habilitiesNames;

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

    public List<String> getAliesNames() {
        return aliesNames;
    }

    public void setAliesNames(List<String> aliesNames) {
        this.aliesNames = aliesNames;
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

    public List<String> getHabilitiesNames() {
        return habilitiesNames;
    }

    public void setHabilitiesNames(List<String> habilitiesNames) {
        this.habilitiesNames = habilitiesNames;
    }


}
