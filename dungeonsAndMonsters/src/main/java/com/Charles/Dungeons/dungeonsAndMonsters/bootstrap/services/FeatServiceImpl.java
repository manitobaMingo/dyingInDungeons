package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.Feat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.FeatRepository;

@Service
public class FeatServiceImpl implements FeatService {

    private final FeatRepository featRepository;

    @Autowired
    public FeatServiceImpl(FeatRepository featRepository) {
        this.featRepository = featRepository;
    }

    @Override
    public Feat getFeatById(Integer id) {
        return featRepository.findOne(id);
    }

    @Override
    public Feat saveFeat(Feat feat) {
        return featRepository.save(feat);
    }

    @Override
    public Iterable<Feat> listAllFeats() {
        return featRepository.findAll();
    }

    @Override
    public void deleteFeat(Integer id) {
        featRepository.delete(id);
    }
}
