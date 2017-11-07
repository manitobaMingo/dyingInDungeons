package services.heroServices;

import domain.character.Race;

public interface RaceService {

    Race getRaceById(Integer id);

    Race saveRace(Race race);

    Iterable<Race> listAllRaces();

    void deleteRace(Integer id);
}
