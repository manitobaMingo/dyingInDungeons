package services.ItemServices;

import domain.items.Weapon;

public interface WeaponService {

    Weapon getWeaponById(Integer id);

    Weapon saveWeapon(Weapon weapon);

    Iterable<Weapon> listAllWeapons();

    void deleteWeapon(Integer id);

}
