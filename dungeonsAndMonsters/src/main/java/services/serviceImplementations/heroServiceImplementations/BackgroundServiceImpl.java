package services.serviceImplementations.heroServiceImplementations;

import domain.character.Background;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.BackgroundRepository;
import services.heroServices.BackgroundService;

public class BackgroundServiceImpl implements BackgroundService {

    private final BackgroundRepository backgroundRepository;
    @Autowired
    public BackgroundServiceImpl(BackgroundRepository backgroundRepository){ this.backgroundRepository = backgroundRepository;}

    @Override
    public Background getBackgroundById(Integer id) {
        return backgroundRepository.findOne(id);
    }

    @Override
    public Background saveBackground(Background background) {
        return backgroundRepository.save(background);
    }

    @Override
    public Iterable<Background> listAllBackgrounds() {
        return backgroundRepository.findAll();
    }
}
