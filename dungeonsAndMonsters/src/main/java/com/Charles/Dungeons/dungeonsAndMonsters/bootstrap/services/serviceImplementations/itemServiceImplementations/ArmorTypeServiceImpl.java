package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.itemServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.ArmorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories.ArmorTypeRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices.ArmorTypeService;
@Service
public class ArmorTypeServiceImpl implements ArmorTypeService {

    private final ArmorTypeRepository armorTypeRepository;
    @Autowired
    public ArmorTypeServiceImpl(ArmorTypeRepository armorTypeRepository){this.armorTypeRepository=armorTypeRepository;}

    @Override
    public ArmorType getArmorTypeById(Integer id) {
        return armorTypeRepository.findOne(id);
    }

    @Override
    public ArmorType saveArmorType(ArmorType armorType) {
        return armorTypeRepository.save(armorType);
    }

    @Override
    public Iterable<ArmorType> listAllArmorTypes() {
        return armorTypeRepository.findAll();
    }

    @Override
    public void deleteArmorType(Integer id) {
        armorTypeRepository.delete(id);
    }
}
