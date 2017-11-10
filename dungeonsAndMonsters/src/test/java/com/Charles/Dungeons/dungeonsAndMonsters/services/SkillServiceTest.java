package com.Charles.Dungeons.dungeonsAndMonsters.services;


import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.DungeonsAndMonstersApplication;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Skill;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.helpers.SkillsObjectMapper;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.heroRepositories.SkillRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.SkillService;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DungeonsAndMonstersApplication.class)
public class SkillServiceTest {

    @Autowired
    private SkillService skillService;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private SkillsObjectMapper skillsObjectMapper;

    @Test
    public void testGetById() throws IOException{
        Skill skill = skillService.getSkillById(1);
        System.out.println(skill);
    }

    @Test
    public void testDb() {
        Skill skill = new Skill();
        skill.setName("TEST");
        skillRepository.save(skill);


        Skill foundSkill = skillRepository.findOne(1);
        System.out.println(foundSkill);
    }

//    @Test
//    public void testSaveApiCallToDB(){
//
//
//    }

    @Test
    public void testApiCall() throws IOException{

        System.out.println(skillsObjectMapper.skillObjectMapper(2));



    }

}

