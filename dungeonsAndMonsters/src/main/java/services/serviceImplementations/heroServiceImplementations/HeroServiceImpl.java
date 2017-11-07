package services.serviceImplementations.heroServiceImplementations;

import domain.character.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.HeroRepository;
import services.heroServices.HeroService;

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
