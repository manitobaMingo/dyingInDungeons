package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.spellServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.spellInfoRepositories.SpellRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.spellServices.SpellService;
@Service
public class SpellServiceImpl implements SpellService {

    private final SpellRepository spellRepository;
    @Autowired
    public SpellServiceImpl(SpellRepository spellRepository){this.spellRepository = spellRepository;}

    @Override
    public Spell getSpellById(Integer id) {
        return spellRepository.findOne(id);
    }

    @Override
    public Spell saveSpell(Spell spell) {
        return spellRepository.save(spell);
    }

    @Override
    public Iterable<Spell> listAllSpells() {
        return spellRepository.findAll();
    }

    @Override
    public void deleteSpell(Integer id) {
        spellRepository.delete(id);
    }
}
