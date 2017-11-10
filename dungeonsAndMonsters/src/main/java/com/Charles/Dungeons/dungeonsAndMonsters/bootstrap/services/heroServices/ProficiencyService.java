package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Proficiency;

public interface ProficiencyService {

    Proficiency getProficiencyById(Integer id);

    Proficiency saveProficiency(Proficiency proficiency);

    Iterable<Proficiency> listAllProficiencies();

    void deleteProficiency(Integer id);


}
