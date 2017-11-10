package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class SubRace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;

    @ManyToOne
    private Race race;


}
