package services.heroServices;

import domain.character.SubHeroClass;

public interface SubHeroClassService {

    SubHeroClass getSubHeroClassById(Integer id);

    SubHeroClass saveSubHeroClass(SubHeroClass subHeroClass);

    Iterable<SubHeroClass> listAllSubHeroClasses();

    void deleteSubHeroClass(Integer id);
}
