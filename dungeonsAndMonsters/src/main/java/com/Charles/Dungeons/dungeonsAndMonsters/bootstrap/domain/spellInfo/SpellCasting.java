package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo;

import javax.persistence.*;

@Entity
public class SpellCasting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;
}
