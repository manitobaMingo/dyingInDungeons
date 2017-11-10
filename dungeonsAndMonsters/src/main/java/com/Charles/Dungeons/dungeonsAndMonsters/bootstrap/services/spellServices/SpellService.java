package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.spellServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.Spell;

public interface SpellService {


    Spell getSpellById(Integer id);

    Spell saveSpell(Spell spell);

    Iterable<Spell> listAllSpells();

    void deleteSpell(Integer id);

}
