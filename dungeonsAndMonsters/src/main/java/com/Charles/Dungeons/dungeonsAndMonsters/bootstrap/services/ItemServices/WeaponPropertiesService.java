package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.WeaponProperties;

public interface WeaponPropertiesService {

    WeaponProperties getWeaponPropertyById(Integer id);

    WeaponProperties saveWeaponProperty(WeaponProperties weaponProperties);

    Iterable<WeaponProperties> listAllWeaponProperties();

    void deleteWeaponProperty(Integer id);
}
