package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.AbilityScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.AbilityScoreRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.AbilityScoreService;

@Service
public class AbilityScoreServiceImpl implements AbilityScoreService {

    private final AbilityScoreRepository abilityScoreRepository;
    @Autowired
    public AbilityScoreServiceImpl(AbilityScoreRepository abilityScoreRepository){this.abilityScoreRepository = abilityScoreRepository;}

    @Override
    public AbilityScore getAbilityScoreById(Integer id) {
        return abilityScoreRepository.findOne(id);
    }

    @Override
    public AbilityScore saveAbilityScore(AbilityScore abilityScore) {
        return abilityScoreRepository.save(abilityScore);
    }

    @Override
    public Iterable<AbilityScore> listAllAbilityScores() {
        return abilityScoreRepository.findAll();
    }

    @Override
    public void deleteAbilityScore(Integer id) {
        abilityScoreRepository.delete(id);
    }
}
