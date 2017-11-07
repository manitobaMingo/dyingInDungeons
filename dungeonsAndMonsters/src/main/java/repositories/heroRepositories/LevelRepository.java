package repositories.heroRepositories;

import domain.character.Level;
import org.springframework.data.repository.CrudRepository;

public interface LevelRepository extends CrudRepository<Level, Integer> {
}
