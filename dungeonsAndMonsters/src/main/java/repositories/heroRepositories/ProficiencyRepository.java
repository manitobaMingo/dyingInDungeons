package repositories.heroRepositories;

import domain.character.Proficiency;
import org.springframework.data.repository.CrudRepository;

public interface ProficiencyRepository extends CrudRepository<Proficiency, Integer> {
}
