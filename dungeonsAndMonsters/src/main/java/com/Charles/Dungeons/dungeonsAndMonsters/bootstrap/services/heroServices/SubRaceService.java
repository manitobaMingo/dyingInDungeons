package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.SubRace;

public interface SubRaceService {

    SubRace getSubRaceById(Integer id);

    SubRace saveSubRace(SubRace subRace);

    Iterable<SubRace> listAllSubRaces();

    void deleteSubRace(Integer id);
}
