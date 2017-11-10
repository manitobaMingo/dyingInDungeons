package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.itemServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.WeaponProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories.WeaponPropertiesRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices.WeaponPropertiesService;

@Service
public class WeaponPropertiesServiceImpl implements WeaponPropertiesService {

    private final WeaponPropertiesRepository weaponPropertiesRepository;
    @Autowired
    public WeaponPropertiesServiceImpl(WeaponPropertiesRepository weaponPropertiesRepository){this.weaponPropertiesRepository = weaponPropertiesRepository;}


    @Override
    public WeaponProperties getWeaponPropertyById(Integer id) {
        return weaponPropertiesRepository.findOne(id);
    }

    @Override
    public WeaponProperties saveWeaponProperty(WeaponProperties weaponProperties) {
        return weaponPropertiesRepository.save(weaponProperties);
    }

    @Override
    public Iterable<WeaponProperties> listAllWeaponProperties() {
        return weaponPropertiesRepository.findAll();
    }

    @Override
    public void deleteWeaponProperty(Integer id) {
        weaponPropertiesRepository.delete(id);
    }
}
