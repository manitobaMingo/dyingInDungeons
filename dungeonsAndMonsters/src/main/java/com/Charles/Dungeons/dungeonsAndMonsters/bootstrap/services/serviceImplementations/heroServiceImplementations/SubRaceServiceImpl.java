package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.SubRace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.SubRaceRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.SubRaceService;
@Service
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
