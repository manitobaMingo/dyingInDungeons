package services.serviceImplementations.heroServiceImplementations;

import domain.character.SubRace;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.SubRaceRepository;
import services.heroServices.SubRaceService;

public class SubRaceServiceImpl implements SubRaceService {

    private final SubRaceRepository subRaceRepository;
    @Autowired
    public SubRaceServiceImpl(SubRaceRepository subRaceRepository){this.subRaceRepository = subRaceRepository;}

    @Override
    public SubRace getSubRaceById(Integer id) {
        return subRaceRepository.findOne(id);
    }

    @Override
    public SubRace saveSubRace(SubRace subRace) {
        return subRaceRepository.save(subRace);
    }

    @Override
    public Iterable<SubRace> listAllSubRaces() {
        return subRaceRepository.findAll();
    }

    @Override
    public void deleteSubRace(Integer id) {
        subRaceRepository.delete(id);
    }
}
