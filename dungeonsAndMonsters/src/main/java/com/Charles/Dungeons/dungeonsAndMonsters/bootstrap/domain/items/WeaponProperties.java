package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items;

import javax.persistence.*;

@Entity
public class WeaponProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;
}
