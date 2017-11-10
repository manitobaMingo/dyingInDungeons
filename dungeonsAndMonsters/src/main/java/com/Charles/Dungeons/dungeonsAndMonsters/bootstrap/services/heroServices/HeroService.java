package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Hero;


public interface HeroService {

    Hero getHeroById(Integer id);

    Hero saveHero(Hero hero);

    Iterable<Hero> listAllHeroes();

    Iterable<Hero> saveHeroList(Iterable<Hero> heroIterable);

    void deleteHero(Integer id);
}
