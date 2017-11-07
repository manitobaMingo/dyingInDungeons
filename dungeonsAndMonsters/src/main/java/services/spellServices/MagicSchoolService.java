package services.spellServices;

import domain.spellInfo.MagicSchool;

public interface MagicSchoolService {

    MagicSchool getMagicSchoolById(Integer id);

    MagicSchool saveMagicSchool(MagicSchool magicSchool);

    Iterable listAllMagicSchools();

    void deleteMagicSchool(Integer id);
}
