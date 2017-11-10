package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.hero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;

    private String name;

    @OneToMany
    private List<Language> languages;


}
