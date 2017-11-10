package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.heroServices.SkillService;

@SpringBootApplication
public class DungeonsAndMonstersApplication {


	@Autowired
	private SkillService skillService;

	public static void main(String[] args) {
		SpringApplication.run(DungeonsAndMonstersApplication.class, args);
	}
}
