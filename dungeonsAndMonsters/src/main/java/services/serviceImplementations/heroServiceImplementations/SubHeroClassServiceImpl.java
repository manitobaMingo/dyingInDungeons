package services.serviceImplementations.heroServiceImplementations;

import domain.character.SubHeroClass;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.SubHeroClassRepository;
import services.heroServices.SubHeroClassService;

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
