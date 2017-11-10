package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.heroServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Skill;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.helpers.SkillsObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.SkillRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.SkillService;

import java.io.IOException;
import java.util.List;
@Log4j
@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    public SkillServiceImpl(SkillRepository skillRepository){this.skillRepository = skillRepository;}

    @Override
    public Skill getSkillById(Integer id) throws IOException{
        // get json from API

        SkillsObjectMapper skillsObjectMapper = (SkillsObjectMapper) skillRepository.findAll();

        return skillsObjectMapper.skillObjectMapper(1);
    }



    @Override
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Iterable<Skill> listAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public void deleteSkill(Integer id) {
        skillRepository.delete(id);
    }
}
