package services.serviceImplementations.heroServiceImplementations;

import domain.character.Traits;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.TraitsRepository;
import services.heroServices.TraitsService;

public class TraitsServiceImpl implements TraitsService {

    private final TraitsRepository traitsRepository;
    @Autowired
    public TraitsServiceImpl(TraitsRepository traitsRepository){this.traitsRepository=traitsRepository;}

    @Override
    public Traits getTraitById(Integer id) {
        return traitsRepository.findOne(id);
    }

    @Override
    public Traits saveTrait(Traits traits) {
        return traitsRepository.save(traits);
    }

    @Override
    public Iterable<Traits> listAllTraits() {
        return traitsRepository.findAll();
    }

    @Override
    public void deleteTrait(Integer id) {
        traitsRepository.delete(id);
    }
}
