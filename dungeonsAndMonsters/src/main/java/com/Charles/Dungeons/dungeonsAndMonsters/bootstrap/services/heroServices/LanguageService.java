package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Language;

public interface LanguageService {

    Language getLanguageById(Integer id);

    Language saveLanguage(Language language);

    Iterable<Language> listAllLanguages();

    void deleteLanguage(Integer id);
}
