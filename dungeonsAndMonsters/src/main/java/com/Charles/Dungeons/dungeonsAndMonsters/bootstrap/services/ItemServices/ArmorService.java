package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Armor;

public interface ArmorService {

    Armor getArmorById(Integer id);

    Armor saveArmor(Armor armor);

    Iterable<Armor> listAllArmor();

    void deleteArmor(Integer id);
}
