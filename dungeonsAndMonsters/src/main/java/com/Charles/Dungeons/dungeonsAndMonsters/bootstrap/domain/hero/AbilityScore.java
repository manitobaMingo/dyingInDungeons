package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class AbilityScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String name;
    private String full_name;
    private String desc;



}
