package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Hero {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;

    private String name;

    @OneToMany
    private List<AbilityScore> abilityScore;
    @OneToMany
    private List<HeroClass> heroClass;
    @OneToMany
    private List<Language> language;
    @OneToOne
    private Level level;
    @OneToMany
    private List<Proficiency> proficiency;
    @OneToOne
    private Race race;





}
