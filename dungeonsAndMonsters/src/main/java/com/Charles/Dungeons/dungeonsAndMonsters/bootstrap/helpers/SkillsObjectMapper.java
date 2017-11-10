package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.helpers;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero.Skill;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.SkillService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

@Log4j
@Service
public class SkillsObjectMapper {

    private final SkillService skillService;

    @Autowired
    public SkillsObjectMapper(SkillService skillService) {
        this.skillService = skillService;
    }

    public Skill skillObjectMapper(Integer id) throws IOException{
        RestTemplate restTemplate = new RestTemplate();

        // MAKE REST CALL AS STRING
        ResponseEntity<String> response = restTemplate.getForEntity("http://www.dnd5eapi.co/api/skills/" + id, String.class);

        // HTTP HEADERS
        HttpHeaders httpHeaders = response.getHeaders();

        Map<String, String> headerMap = httpHeaders.toSingleValueMap();
        headerMap.forEach((k,v) -> {
            System.out.println(k + ": " + v);
        });

        // map to POJO
        ObjectMapper objectMapper = new ObjectMapper();

        // GET JSON OUT OF RESPONSE BODY
        JsonNode root = objectMapper.readTree(response.getBody());
        log.info(root.toString());

        log.info("*********DESCRIPTION********");
        log.info(root.get("desc").get(0));
        log.info("*****************");

        root.fieldNames().forEachRemaining(System.out::println);

        return null;
//        Skill skill = objectMapper.readValue("http://www.dnd5eapi.co/api/skills/" + id , Skill.class);
//        log.info(skill.toString());
//
//        skillService.saveSkill(skill);
//
//        return skill;
    }


    public void getAllSkills(int startId, int endId) throws IOException{
        for(int i = startId; i <= endId; i++ ) {
            skillObjectMapper(i);


        }
    }

}
