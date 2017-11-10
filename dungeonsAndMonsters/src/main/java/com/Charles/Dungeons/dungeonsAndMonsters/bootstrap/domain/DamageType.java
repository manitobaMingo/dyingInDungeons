package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain;

import javax.persistence.*;

@Entity
public class DamageType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;
}
