package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.LevelRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.LevelService;
@Service
public class LevelServiceImpl implements LevelService {

    private final LevelRepository levelRepository;
    @Autowired
    public LevelServiceImpl(LevelRepository levelRepository){this.levelRepository = levelRepository;}

    @Override
    public Level getLevelById(Integer id) {
        return levelRepository.findOne(id);
    }

    @Override
    public Level saveLevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public Iterable<Level> listAllLevels() {
        return levelRepository.findAll();
    }
}
