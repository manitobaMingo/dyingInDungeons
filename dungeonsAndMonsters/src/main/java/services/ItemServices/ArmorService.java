package services.ItemServices;

import domain.items.Armor;

public interface ArmorService {

    Armor getArmorById(Integer id);

    Armor saveArmor(Armor armor);

    Iterable<Armor> listAllArmor();

    void deleteArmor(Integer id);
}
