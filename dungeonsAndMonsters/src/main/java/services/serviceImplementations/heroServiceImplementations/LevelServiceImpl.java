package services.serviceImplementations.heroServiceImplementations;

import domain.character.Level;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.LevelRepository;
import services.heroServices.LevelService;

public class LevelServiceImpl implements LevelService {

    private final LevelRepository levelRepository;
    @Autowired
    public LevelServiceImpl(LevelRepository levelRepository){this.levelRepository = levelRepository;}

    @Override
    public Level getLevelById(Integer id) {
        return levelRepository.findOne(id);
    }

    @Override
    public Level saveLevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public Iterable<Level> listAllLevels() {
        return levelRepository.findAll();
    }
}
