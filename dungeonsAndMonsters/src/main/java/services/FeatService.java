package services;

import domain.Feat;

public interface FeatService {

    Feat getFeatById(Integer id);

    Feat saveFeat(Feat feat);

    Iterable<Feat> listAllFeats();

    void deleteFeat(Integer id);

}
