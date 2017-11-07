package services;

import domain.DamageType;

public interface DamageTypeService {

    DamageType getDamageTypeById(Integer id);

    DamageType saveDamageType(DamageType damageType);

    Iterable listAllDamageTypes();

    void deleteDamageType(Integer id);

}
