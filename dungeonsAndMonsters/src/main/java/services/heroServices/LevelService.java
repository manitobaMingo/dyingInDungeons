package services.heroServices;

import domain.character.Level;

public interface LevelService {

    Level getLevelById(Integer id);

    Level saveLevel(Level level);

    Iterable<Level> listAllLevels();
}
