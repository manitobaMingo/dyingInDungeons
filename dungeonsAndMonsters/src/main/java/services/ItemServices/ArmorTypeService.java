package services.ItemServices;

import domain.items.ArmorType;

public interface ArmorTypeService {

    ArmorType getArmorTypeById(Integer id);

    ArmorType saveArmorType(ArmorType armorType);

    Iterable<ArmorType> listAllArmorTypes();

    void deleteArmorType(Integer id);

}
