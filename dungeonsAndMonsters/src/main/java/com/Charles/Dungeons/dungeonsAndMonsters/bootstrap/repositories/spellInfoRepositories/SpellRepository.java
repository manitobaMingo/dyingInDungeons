package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.spellInfoRepositories;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.Spell;
import org.springframework.data.repository.CrudRepository;

public interface SpellRepository extends CrudRepository<Spell, Integer> {
}
