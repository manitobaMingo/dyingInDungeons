package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain;

import javax.persistence.*;

@Entity
public class Feat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;
}
