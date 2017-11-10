package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.HeroClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.HeroClassRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.HeroClassService;
@Service
public class HeroClassServiceImpl implements HeroClassService {


    private final HeroClassRepository heroClassRepository;
    @Autowired
    public HeroClassServiceImpl(HeroClassRepository heroClassRepository){this.heroClassRepository = heroClassRepository;}

    @Override
    public HeroClass getHeroClassById(Integer id) {
        return heroClassRepository.findOne(id);
    }

    @Override
    public HeroClass saveHeroClass(HeroClass heroClass) {
        return heroClassRepository.save(heroClass);
    }

    @Override
    public Iterable<HeroClass> listAllHeroClasses() {
        return heroClassRepository.findAll() ;
    }

    @Override
    public void deleteHeroClass(Integer id) {
        heroClassRepository.delete(id);
    }
}
