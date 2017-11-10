package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Background;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.BackgroundRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.BackgroundService;
@Service
public class BackgroundServiceImpl implements BackgroundService {

    private final BackgroundRepository backgroundRepository;
    @Autowired
    public BackgroundServiceImpl(BackgroundRepository backgroundRepository){ this.backgroundRepository = backgroundRepository;}

    @Override
    public Background getBackgroundById(Integer id) {
        return backgroundRepository.findOne(id);
    }

    @Override
    public Background saveBackground(Background background) {
        return backgroundRepository.save(background);
    }

    @Override
    public Iterable<Background> listAllBackgrounds() {
        return backgroundRepository.findAll();
    }
}
