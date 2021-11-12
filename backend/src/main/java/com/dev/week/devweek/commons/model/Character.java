package com.dev.week.devweek.commons.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dev.week.devweek.commons.enums.CharacterTypeEnum;
import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

@Entity
@Table(name = "CHARACTERS")
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

    @ManyToMany
    @JoinTable(
        name = "CHARACTER_ALLIES",
        joinColumns = @JoinColumn(name = "CHARACTER_NAME", referencedColumnName = "NAME"),
        inverseJoinColumns = @JoinColumn(name = "ALLY_NAME", referencedColumnName = "NAME")  
    )
    private List<Character> allies;

    @ManyToMany
    @JoinTable(
        name = "CHARACTER_TEAMS",
        joinColumns = @JoinColumn(name = "CHARACTER_NAME", referencedColumnName = "NAME"),
        inverseJoinColumns = @JoinColumn(name = "TEAM_NAME", referencedColumnName = "NAME")  
    )
    private List<Team> partOf;

    @OneToOne
    @JoinColumn(name = "FIRST_APPEARANCE_ID")
    private FirstAppearance firstAppearance;

    @ManyToMany
    @JoinTable(
        name = "CHARACTER_ABILITIES",
        joinColumns = @JoinColumn(name = "CHARACTER_NAME", referencedColumnName = "NAME"),
        inverseJoinColumns = @JoinColumn(name = "ABILIITY_NAME", referencedColumnName = "NAME")  
    )
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

    public List<Character> getAllies() {
        return allies;
    }

    public void setAllies(List<Character> alies) {
        this.allies = alies;
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
