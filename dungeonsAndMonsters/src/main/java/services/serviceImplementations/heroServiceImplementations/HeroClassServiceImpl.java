package services.serviceImplementations.heroServiceImplementations;

import domain.character.HeroClass;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.HeroClassRepository;
import services.heroServices.HeroClassService;

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
