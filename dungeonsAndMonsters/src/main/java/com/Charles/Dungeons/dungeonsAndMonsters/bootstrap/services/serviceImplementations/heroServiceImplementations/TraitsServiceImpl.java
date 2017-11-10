package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Traits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.TraitsRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.TraitsService;
@Service
public class TraitsServiceImpl implements TraitsService {

    private final TraitsRepository traitsRepository;
    @Autowired
    public TraitsServiceImpl(TraitsRepository traitsRepository){this.traitsRepository=traitsRepository;}

    @Override
    public Traits getTraitById(Integer id) {
        return traitsRepository.findOne(id);
    }

    @Override
    public Traits saveTrait(Traits traits) {
        return traitsRepository.save(traits);
    }

    @Override
    public Iterable<Traits> listAllTraits() {
        return traitsRepository.findAll();
    }

    @Override
    public void deleteTrait(Integer id) {
        traitsRepository.delete(id);
    }
}
