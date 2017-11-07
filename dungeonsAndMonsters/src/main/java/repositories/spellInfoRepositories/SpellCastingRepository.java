package repositories.spellInfoRepositories;

import domain.spellInfo.SpellCasting;
import org.springframework.data.repository.CrudRepository;

public interface SpellCastingRepository extends CrudRepository<SpellCasting, Integer> {
}
