package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Background;

public interface BackgroundService {

    Background getBackgroundById(Integer id);

    Background saveBackground(Background background);

    Iterable<Background> listAllBackgrounds();



}
