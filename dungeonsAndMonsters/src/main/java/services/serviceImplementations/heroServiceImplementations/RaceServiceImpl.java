package services.serviceImplementations.heroServiceImplementations;

import domain.character.Race;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.RaceRepository;
import services.heroServices.RaceService;

public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;
    @Autowired
    public RaceServiceImpl(RaceRepository raceRepository){this.raceRepository = raceRepository;}

    @Override
    public Race getRaceById(Integer id) {
        return raceRepository.findOne(id);
    }

    @Override
    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public Iterable<Race> listAllRaces() {
        return raceRepository.findAll();
    }

    @Override
    public void deleteRace(Integer id) {
        raceRepository.delete(id);
    }
}
