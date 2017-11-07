package repositories;

import domain.Condition;
import org.springframework.data.repository.CrudRepository;

public interface ConditionRepository extends CrudRepository<Condition, Integer> {
}
