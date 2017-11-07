package services.heroServices;

import domain.character.HeroClass;

public interface HeroClassService {

    HeroClass getHeroClassById(Integer id);

    HeroClass saveHeroClass(HeroClass heroClass);

    Iterable<HeroClass> listAllHeroClasses();

    void deleteHeroClass(Integer id);
}
