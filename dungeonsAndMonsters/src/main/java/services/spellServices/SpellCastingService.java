package services.spellServices;

import domain.spellInfo.SpellCasting;

public interface SpellCastingService {

    SpellCasting getSpellCastingById(Integer id);

    SpellCasting saveSpellCasting(SpellCasting spellCasting);

    Iterable listAllSpellCasting();

    void deleteSpellCasting(Integer id);

}
