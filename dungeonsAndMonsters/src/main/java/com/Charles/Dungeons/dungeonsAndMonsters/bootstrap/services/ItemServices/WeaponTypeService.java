package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.WeaponType;

public interface WeaponTypeService {

    WeaponType getWeaponTypeById(Integer id);

    WeaponType saveWeaponType(WeaponType weaponType);

    Iterable<WeaponType> listAllWeaponTypes();

    void deleteWeaponType(Integer id);
}
