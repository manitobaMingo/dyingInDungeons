package services.heroServices;

import domain.character.SubRace;

public interface SubRaceService {

    SubRace getSubRaceById(Integer id);

    SubRace saveSubRace(SubRace subRace);

    Iterable<SubRace> listAllSubRaces();

    void deleteSubRace(Integer id);
}
