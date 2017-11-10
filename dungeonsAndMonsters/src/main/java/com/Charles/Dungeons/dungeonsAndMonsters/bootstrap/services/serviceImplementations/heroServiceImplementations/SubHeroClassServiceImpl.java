package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.SubHeroClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.SubHeroClassRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.SubHeroClassService;
@Service
public class SubHeroClassServiceImpl implements SubHeroClassService {

    private final SubHeroClassRepository subHeroClassRepository;
    @Autowired
    public SubHeroClassServiceImpl(SubHeroClassRepository subHeroClassRepository){this.subHeroClassRepository = subHeroClassRepository;}

    @Override
    public SubHeroClass getSubHeroClassById(Integer id) {
        return subHeroClassRepository.findOne(id);
    }

    @Override
    public SubHeroClass saveSubHeroClass(SubHeroClass subHeroClass) {
        return subHeroClassRepository.save(subHeroClass);
    }

    @Override
    public Iterable<SubHeroClass> listAllSubHeroClasses() {
        return subHeroClassRepository.findAll();
    }

    @Override
    public void deleteSubHeroClass(Integer id) {
        subHeroClassRepository.delete(id);
    }
}
