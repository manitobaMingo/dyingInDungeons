package services.ItemServices;

import domain.items.WeaponType;

public interface WeaponTypeService {

    WeaponType getWeaponTypeById(Integer id);

    WeaponType saveWeaponType(WeaponType weaponType);

    Iterable<WeaponType> listAllWeaponTypes();

    void deleteWeaponType(Integer id);
}
