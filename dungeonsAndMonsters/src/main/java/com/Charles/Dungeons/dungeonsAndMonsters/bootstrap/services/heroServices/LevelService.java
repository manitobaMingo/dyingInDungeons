package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Level;

public interface LevelService {

    Level getLevelById(Integer id);

    Level saveLevel(Level level);

    Iterable<Level> listAllLevels();
}
