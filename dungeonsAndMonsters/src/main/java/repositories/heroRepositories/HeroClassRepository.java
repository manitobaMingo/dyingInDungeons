package repositories.heroRepositories;

import domain.character.HeroClass;
import org.springframework.data.repository.CrudRepository;

public interface HeroClassRepository extends CrudRepository<HeroClass, Integer> {
}
