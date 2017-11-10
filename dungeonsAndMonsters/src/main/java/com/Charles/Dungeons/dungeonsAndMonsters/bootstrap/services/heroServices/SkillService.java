package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Skill;

import java.io.IOException;

public interface SkillService {

    Skill getSkillById(Integer id) throws IOException;

    Skill saveSkill(Skill skill);

    Iterable<Skill> listAllSkills();

    void deleteSkill(Integer id);
}
