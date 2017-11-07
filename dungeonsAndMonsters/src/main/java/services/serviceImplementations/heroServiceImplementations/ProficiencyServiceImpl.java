package services.serviceImplementations.heroServiceImplementations;

import domain.character.Proficiency;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.ProficiencyRepository;
import services.heroServices.ProficiencyService;

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
