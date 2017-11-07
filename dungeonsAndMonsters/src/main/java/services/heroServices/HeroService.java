package services.heroServices;

import domain.character.Hero;
import org.springframework.stereotype.Service;


public interface HeroService {

    Hero getHeroById(Integer id);

    Hero saveHero(Hero hero);

    Iterable<Hero> listAllHeroes();

    Iterable<Hero> saveHeroList(Iterable<Hero> heroIterable);

    void deleteHero(Integer id);
}
