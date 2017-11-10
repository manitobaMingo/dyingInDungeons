package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Race;

public interface RaceService {

    Race getRaceById(Integer id);

    Race saveRace(Race race);

    Iterable<Race> listAllRaces();

    void deleteRace(Integer id);
}
