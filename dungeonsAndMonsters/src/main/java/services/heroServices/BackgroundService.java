package services.heroServices;

import domain.character.Background;

public interface BackgroundService {

    Background getBackgroundById(Integer id);

    Background saveBackground(Background background);

    Iterable<Background> listAllBackgrounds();



}
