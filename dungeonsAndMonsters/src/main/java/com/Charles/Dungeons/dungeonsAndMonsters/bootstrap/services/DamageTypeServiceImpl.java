package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.DamageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.DamageTypeRepository;
@Service
public class DamageTypeServiceImpl implements DamageTypeService {

    private final DamageTypeRepository damageTypeRepository;
    @Autowired
    public DamageTypeServiceImpl(DamageTypeRepository damageTypeRepository){this.damageTypeRepository = damageTypeRepository;}

    @Override
    public DamageType getDamageTypeById(Integer id) {
        return damageTypeRepository.findOne(id);
    }

    @Override
    public DamageType saveDamageType(DamageType damageType) {
        return damageTypeRepository.save(damageType);
    }

    @Override
    public Iterable listAllDamageTypes() {
        return damageTypeRepository.findAll();
    }

    @Override
    public void deleteDamageType(Integer id){
        damageTypeRepository.delete(id);
    }
}
