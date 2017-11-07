package repositories.heroRepositories;

import domain.character.Race;
import org.springframework.data.repository.CrudRepository;

public interface RaceRepository extends CrudRepository<Race, Integer> {
}
