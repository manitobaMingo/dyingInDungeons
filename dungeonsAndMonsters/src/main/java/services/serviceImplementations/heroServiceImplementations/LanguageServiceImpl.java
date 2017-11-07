package services.serviceImplementations.heroServiceImplementations;

import domain.character.Language;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.heroRepositories.LanguageRepository;
import services.heroServices.LanguageService;

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
