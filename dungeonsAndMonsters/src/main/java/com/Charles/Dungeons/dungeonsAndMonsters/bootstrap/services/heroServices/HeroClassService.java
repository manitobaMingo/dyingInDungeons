package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.HeroClass;

public interface HeroClassService {

    HeroClass getHeroClassById(Integer id);

    HeroClass saveHeroClass(HeroClass heroClass);

    Iterable<HeroClass> listAllHeroClasses();

    void deleteHeroClass(Integer id);
}
