package repositories.heroRepositories;

import domain.character.Hero;
import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, Integer>{
}
