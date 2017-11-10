package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.itemServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Armor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories.ArmorRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices.ArmorService;
@Service
public class ArmorServiceImpl implements ArmorService {

    private final ArmorRepository armorRepository;
    @Autowired
    public ArmorServiceImpl(ArmorRepository armorRepository){this.armorRepository = armorRepository;}

    @Override
    public Armor getArmorById(Integer id) {
        return armorRepository.findOne(id);
    }

    @Override
    public Armor saveArmor(Armor armor) {
        return armorRepository.save(armor);
    }

    @Override
    public Iterable<Armor> listAllArmor() {
        return armorRepository.findAll();
    }

    @Override
    public void deleteArmor(Integer id) {
        armorRepository.delete(id);
    }
}
