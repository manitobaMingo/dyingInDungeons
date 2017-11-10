package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.LanguageRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.LanguageService;
@Service
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;
    @Autowired
    public LanguageServiceImpl(LanguageRepository languageRepository){this.languageRepository = languageRepository;}

    @Override
    public Language getLanguageById(Integer id) {
        return languageRepository.findOne(id);
    }

    @Override
    public Language saveLanguage(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public Iterable<Language> listAllLanguages() {
        return languageRepository.findAll();
    }

    @Override
    public void deleteLanguage(Integer id) {
        languageRepository.delete(id);
    }
}
