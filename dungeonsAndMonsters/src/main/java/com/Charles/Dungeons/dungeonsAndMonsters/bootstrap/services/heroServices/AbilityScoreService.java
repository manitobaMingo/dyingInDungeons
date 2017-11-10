package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.AbilityScore;

public interface AbilityScoreService {

    AbilityScore getAbilityScoreById(Integer id);

    AbilityScore saveAbilityScore(AbilityScore abilityScore);

    Iterable<AbilityScore> listAllAbilityScores();

    void deleteAbilityScore(Integer id);
}
