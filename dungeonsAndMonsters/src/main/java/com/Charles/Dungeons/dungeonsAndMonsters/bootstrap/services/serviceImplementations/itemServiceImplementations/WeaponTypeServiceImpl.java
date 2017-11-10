package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.itemServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.WeaponType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories.WeaponTypeRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices.WeaponTypeService;
@Service
public class WeaponTypeServiceImpl implements WeaponTypeService {

    private final WeaponTypeRepository weaponTypeRepository;
    @Autowired
    public WeaponTypeServiceImpl(WeaponTypeRepository weaponTypeRepository){this.weaponTypeRepository=weaponTypeRepository;}

    @Override
    public WeaponType getWeaponTypeById(Integer id) {
        return weaponTypeRepository.findOne(id);
    }

    @Override
    public WeaponType saveWeaponType(WeaponType weaponType) {
        return weaponTypeRepository.save(weaponType);
    }

    @Override
    public Iterable<WeaponType> listAllWeaponTypes() {
        return weaponTypeRepository.findAll();
    }

    @Override
    public void deleteWeaponType(Integer id) {
        weaponTypeRepository.delete(id);
    }
}
