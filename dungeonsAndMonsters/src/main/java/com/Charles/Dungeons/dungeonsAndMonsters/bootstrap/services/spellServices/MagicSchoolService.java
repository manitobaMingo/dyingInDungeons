package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.spellServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.MagicSchool;

public interface MagicSchoolService {

    MagicSchool getMagicSchoolById(Integer id);

    MagicSchool saveMagicSchool(MagicSchool magicSchool);

    Iterable listAllMagicSchools();

    void deleteMagicSchool(Integer id);
}
