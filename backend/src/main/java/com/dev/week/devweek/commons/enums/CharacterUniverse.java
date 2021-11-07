package com.dev.week.devweek.commons.enums;

public enum CharacterUniverse {
    
    DC("dc"),
    MARVEL("marvel");

    private String universe;

    private CharacterUniverse(String universe) {
        this.universe = universe;
    }
}
