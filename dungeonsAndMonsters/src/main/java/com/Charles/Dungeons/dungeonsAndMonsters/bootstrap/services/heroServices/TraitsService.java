package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Traits;

public interface TraitsService {

    Traits getTraitById(Integer id);

    Traits saveTrait(Traits traits);

    Iterable<Traits> listAllTraits();

    void deleteTrait(Integer id);
}
