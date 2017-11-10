package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.HeroRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.HeroService;
@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;
    @Autowired
    public HeroServiceImpl(HeroRepository heroRepository){this.heroRepository = heroRepository;}

    @Override
    public Hero getHeroById(Integer id) {
        return heroRepository.findOne(id);
    }

    @Override
    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public Iterable<Hero> listAllHeroes() {
        return heroRepository.findAll();
    }

    @Override
    public Iterable<Hero> saveHeroList(Iterable<Hero> heroIterable) {
        return heroRepository.save(heroIterable);
    }

    @Override
    public void deleteHero(Integer id) {
        heroRepository.delete(id);
    }
}
