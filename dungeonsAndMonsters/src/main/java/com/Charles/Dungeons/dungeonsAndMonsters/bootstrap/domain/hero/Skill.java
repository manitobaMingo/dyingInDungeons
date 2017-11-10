package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String name;

    @Column(columnDefinition = "MEDIUMTEXT")
//    @ElementCollection(targetClass = String.class)
    private String[] desc;

}
