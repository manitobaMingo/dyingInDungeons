package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Proficiency {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;


    @ManyToOne
    private HeroClass heroClass;
}
