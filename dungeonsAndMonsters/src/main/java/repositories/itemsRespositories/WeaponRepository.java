package repositories.itemsRespositories;

import domain.items.Weapon;
import org.springframework.data.repository.CrudRepository;

public interface WeaponRepository extends CrudRepository<Weapon, Integer> {
}
