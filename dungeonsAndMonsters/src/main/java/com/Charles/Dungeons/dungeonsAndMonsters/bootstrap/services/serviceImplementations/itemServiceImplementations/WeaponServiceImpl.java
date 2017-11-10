package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.itemServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories.WeaponRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices.WeaponService;
@Service
public class WeaponServiceImpl implements WeaponService {

    private final WeaponRepository weaponRepository;
    @Autowired
    public WeaponServiceImpl(WeaponRepository weaponRepository){this.weaponRepository = weaponRepository;}


    @Override
    public Weapon getWeaponById(Integer id) {
        return weaponRepository.findOne(id);
    }

    @Override
    public Weapon saveWeapon(Weapon weapon) {
        return weaponRepository.save(weapon);
    }

    @Override
    public Iterable<Weapon> listAllWeapons() {
        return weaponRepository.findAll();
    }

    @Override
    public void deleteWeapon(Integer id) {
        weaponRepository.delete(id);
    }
}
