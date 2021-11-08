package com.dev.week.devweek.commons.enums;

public enum CharacterUniverseEnum {
    
    DC("dc"),
    MARVEL("marvel");

    private String universe;

    private CharacterUniverseEnum(String universe) {
        this.universe = universe;
    }
}
