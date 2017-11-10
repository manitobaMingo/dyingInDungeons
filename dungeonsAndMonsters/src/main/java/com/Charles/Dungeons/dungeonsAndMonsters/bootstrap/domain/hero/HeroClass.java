package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class HeroClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;

    private String name;
    private int hitDie;

    @OneToOne
    private SubHeroClass subHeroClass;


}
