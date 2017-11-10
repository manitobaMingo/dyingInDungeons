package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.ArmorType;

public interface ArmorTypeService {

    ArmorType getArmorTypeById(Integer id);

    ArmorType saveArmorType(ArmorType armorType);

    Iterable<ArmorType> listAllArmorTypes();

    void deleteArmorType(Integer id);

}
