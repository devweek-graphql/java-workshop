package com.dev.week.devweek.commons.enums;

public enum CharacterTypeEnum {
    
    HERO("hero"),
    VILLAN("villain"),
    ANTIHERO("antihero");

    private String characterType;

    CharacterTypeEnum(String characterType) {
        this.characterType = characterType;
    }
}
