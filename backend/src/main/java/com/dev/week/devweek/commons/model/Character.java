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

import com.dev.week.devweek.commons.enums.CharacterType;
import com.dev.week.devweek.commons.enums.CharacterUniverse;

@Entity
@Table(name = "CHARACTER")
public class Character {
    
    @Id
    @Column(name = "NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIVERSE")
    private CharacterUniverse universe;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private CharacterType type;

    @OneToMany
    private List<Character> alies;

    @OneToMany
    private List<Team> partOf;

    @OneToOne
    @JoinColumn(name = "FIRST_APPEARANCE_ID")
    private FirstAppearance firstAppearance;

    @OneToMany
    private List<Ability> habilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterUniverse getUniverse() {
        return universe;
    }

    public void setUniverse(CharacterUniverse universe) {
        this.universe = universe;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
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

    public List<Ability> getHabilities() {
        return habilities;
    }

    public void setHabilities(List<Ability> habilities) {
        this.habilities = habilities;
    }
}
