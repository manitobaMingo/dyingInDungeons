package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.Feat;

public interface FeatService {

    Feat getFeatById(Integer id);

    Feat saveFeat(Feat feat);

    Iterable<Feat> listAllFeats();

    void deleteFeat(Integer id);

}
