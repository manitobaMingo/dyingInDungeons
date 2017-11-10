package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.spellServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.SpellCasting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.spellInfoRepositories.SpellCastingRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.spellServices.SpellCastingService;
@Service
public class SpellCastingServiceImpl implements SpellCastingService {

    private final SpellCastingRepository spellCastingRepository;
    @Autowired
    public SpellCastingServiceImpl(SpellCastingRepository spellCastingRepository){this.spellCastingRepository = spellCastingRepository;}

    @Override
    public SpellCasting getSpellCastingById(Integer id) {
        return spellCastingRepository.findOne(id);
    }

    @Override
    public SpellCasting saveSpellCasting(SpellCasting spellCasting) {
        return spellCastingRepository.save(spellCasting);
    }

    @Override
    public Iterable listAllSpellCasting() {
        return spellCastingRepository.findAll();
    }

    @Override
    public void deleteSpellCasting(Integer id) {
        spellCastingRepository.delete(id);
    }
}
