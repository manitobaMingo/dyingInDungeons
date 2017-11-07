package services.ItemServices;

import domain.items.WeaponProperties;

public interface WeaponPropertiesService {

    WeaponProperties getWeaponPropertyById(Integer id);

    WeaponProperties saveWeaponProperty(WeaponProperties weaponProperties);

    Iterable<WeaponProperties> listAllWeaponProperties();

    void deleteWeaponProperty(Integer id);
}
