package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Proficiency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.ProficiencyRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.ProficiencyService;
@Service
public class ProficiencyServiceImpl implements ProficiencyService {

    private final ProficiencyRepository proficiencyRepository;
    @Autowired
    public ProficiencyServiceImpl(ProficiencyRepository proficiencyRepository){this.proficiencyRepository = proficiencyRepository;}


    @Override
    public Proficiency getProficiencyById(Integer id) {
        return proficiencyRepository.findOne(id);
    }

    @Override
    public Proficiency saveProficiency(Proficiency proficiency) {
        return proficiencyRepository.save(proficiency);
    }

    @Override
    public Iterable<Proficiency> listAllProficiencies() {
        return proficiencyRepository.findAll();
    }

    @Override
    public void deleteProficiency(Integer id) {
        proficiencyRepository.delete(id);
    }
}
