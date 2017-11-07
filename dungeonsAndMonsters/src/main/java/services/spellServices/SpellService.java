package services.spellServices;

import domain.spellInfo.Spell;

public interface SpellService {


    Spell getSpellById(Integer id);

    Spell saveSpell(Spell spell);

    Iterable<Spell> listAllSpells();

    void deleteSpell(Integer id);

}
