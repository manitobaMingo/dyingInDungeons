package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.spellServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.spellInfo.MagicSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.spellInfoRepositories.MagicSchoolRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.spellServices.MagicSchoolService;
@Service
public class MagicSchoolServiceImpl implements MagicSchoolService {

    private final MagicSchoolRepository magicSchoolRepository;
    @Autowired
    public MagicSchoolServiceImpl(MagicSchoolRepository magicSchoolRepository){this.magicSchoolRepository = magicSchoolRepository;}

    @Override
    public MagicSchool getMagicSchoolById(Integer id) {
        return magicSchoolRepository.findOne(id);
    }

    @Override
    public MagicSchool saveMagicSchool(MagicSchool magicSchool) {
        return magicSchoolRepository.save(magicSchool);
    }

    @Override
    public Iterable listAllMagicSchools() {
        return magicSchoolRepository.findAll();
    }

    @Override
    public void deleteMagicSchool(Integer id) {
        magicSchoolRepository.delete(id);
    }
}
