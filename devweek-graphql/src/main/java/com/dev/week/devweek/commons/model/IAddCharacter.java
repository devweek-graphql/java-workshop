package com.dev.week.devweek.commons.model;

import java.util.List;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public interface IAddCharacter {
    
    public String getName();

    public void setName(String name);

    public CharacterUniverseEnum getUniverse();

    public void setUniverse(CharacterUniverseEnum universe);

    public CharacterTypeEnum getType();

    public void setType(CharacterTypeEnum type);

    public List<String> getAlliesIds();

    public void setAlliesIds(List<String> alliesIds);

    public List<String> getPartOfIds();

    public void setPartOfIds(List<String> partOfIds);

    public String getFirstAppearanceId();

    public void setFirstAppearanceId(String firstAppearanceId);

    public List<String> getAbilitiesIds();

    public void setAbilitiesIds(List<String> abilitiesIds);
}
