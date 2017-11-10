package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Weapon;

public interface WeaponService {

    Weapon getWeaponById(Integer id);

    Weapon saveWeapon(Weapon weapon);

    Iterable<Weapon> listAllWeapons();

    void deleteWeapon(Integer id);

}
