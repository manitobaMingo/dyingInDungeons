package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.spellInfoRepositories;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.SpellCasting;
import org.springframework.data.repository.CrudRepository;

public interface SpellCastingRepository extends CrudRepository<SpellCasting, Integer> {
}
