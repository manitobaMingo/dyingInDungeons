package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
