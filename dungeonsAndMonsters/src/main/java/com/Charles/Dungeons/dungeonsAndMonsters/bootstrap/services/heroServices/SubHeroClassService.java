package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.SubHeroClass;

public interface SubHeroClassService {

    SubHeroClass getSubHeroClassById(Integer id);

    SubHeroClass saveSubHeroClass(SubHeroClass subHeroClass);

    Iterable<SubHeroClass> listAllSubHeroClasses();

    void deleteSubHeroClass(Integer id);
}
