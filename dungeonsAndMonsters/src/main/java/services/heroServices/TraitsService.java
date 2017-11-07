package services.heroServices;

import domain.character.Traits;

public interface TraitsService {

    Traits getTraitById(Integer id);

    Traits saveTrait(Traits traits);

    Iterable<Traits> listAllTraits();

    void deleteTrait(Integer id);
}
