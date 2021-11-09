package com.dev.week.devweek.commons.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

@Entity
@Table(name = "CHARACTER")
public class Character {
    
    @Id
    @Column(name = "NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIVERSE")
    private CharacterUniverseEnum universe;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private CharacterTypeEnum type;

    @OneToMany
    private List<Character> alies;

    @OneToMany
    private List<Team> partOf;

    @OneToOne
    @JoinColumn(name = "FIRST_APPEARANCE_ID")
    private FirstAppearance firstAppearance;

    @OneToMany
    private List<Ability> abilities;

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

    public List<Character> getAlies() {
        return alies;
    }

    public void setAlies(List<Character> alies) {
        this.alies = alies;
    }

    public List<Team> getPartOf() {
        return partOf;
    }

    public void setPartOf(List<Team> partOf) {
        this.partOf = partOf;
    }

    public FirstAppearance getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(FirstAppearance firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> habilities) {
        this.abilities = habilities;
    }
}
