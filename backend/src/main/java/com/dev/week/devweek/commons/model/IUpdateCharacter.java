package com.dev.week.devweek.commons.model;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public interface IUpdateCharacter {

    public CharacterUniverseEnum getUniverse();

    public void setUniverse(CharacterUniverseEnum universe);

    public CharacterTypeEnum getType();

    public void setType(CharacterTypeEnum type);

    public List<String> getAlliesIdsToAdd();

    public void setAlliesIdsToAdd(List<String> alliesIdsToAdd);

    public List<String> getPartOfIdsToAdd();

    public void setPartOfIdsToAdd(List<String> partOfIdsToAdd);

    public String getFirstAppearanceId();

    public void setFirstAppearanceId(String firstAppearanceId);

    public List<String> getAbilitiesIdsToAdd();

    public void setAbilitiesIdsToAdd(List<String> abilitiesIdsToAdd);
}
