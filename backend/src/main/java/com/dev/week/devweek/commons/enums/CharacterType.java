package com.dev.week.devweek.commons.enums;

public enum CharacterType {
    
    HERO("hero"),
    VILLAN("villain"),
    ANTIHERO("antihero");

    private String characterType;

    CharacterType(String characterType) {
        this.characterType = characterType;
    }
}
