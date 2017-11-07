package services.heroServices;

import domain.character.Language;

public interface LanguageService {

    Language getLanguageById(Integer id);

    Language saveLanguage(Language language);

    Iterable<Language> listAllLanguages();

    void deleteLanguage(Integer id);
}
