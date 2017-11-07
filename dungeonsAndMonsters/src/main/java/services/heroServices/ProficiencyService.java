package services.heroServices;

import domain.character.Proficiency;

public interface ProficiencyService {

    Proficiency getProficiencyById(Integer id);

    Proficiency saveProficiency(Proficiency proficiency);

    Iterable<Proficiency> listAllProficiencies();

    void deleteProficiency(Integer id);


}
