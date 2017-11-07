package repositories.spellInfoRepositories;

import domain.spellInfo.Spell;
import org.springframework.data.repository.CrudRepository;

public interface SpellRepository extends CrudRepository<Spell, Integer> {
}
