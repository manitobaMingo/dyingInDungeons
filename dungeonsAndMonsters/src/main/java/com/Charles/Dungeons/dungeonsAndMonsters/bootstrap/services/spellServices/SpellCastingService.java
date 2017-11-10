package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.spellServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.SpellCasting;

public interface SpellCastingService {

    SpellCasting getSpellCastingById(Integer id);

    SpellCasting saveSpellCasting(SpellCasting spellCasting);

    Iterable listAllSpellCasting();

    void deleteSpellCasting(Integer id);

}
