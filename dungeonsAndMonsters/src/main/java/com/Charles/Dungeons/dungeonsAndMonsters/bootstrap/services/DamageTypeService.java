package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.DamageType;

public interface DamageTypeService {

    DamageType getDamageTypeById(Integer id);

    DamageType saveDamageType(DamageType damageType);

    Iterable listAllDamageTypes();

    void deleteDamageType(Integer id);

}
