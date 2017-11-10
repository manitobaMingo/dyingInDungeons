package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.RaceRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.RaceService;
@Service
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
