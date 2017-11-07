package repositories.heroRepositories;

import domain.character.Traits;
import org.springframework.data.repository.CrudRepository;

public interface TraitsRepository extends CrudRepository<Traits, Integer> {
}
