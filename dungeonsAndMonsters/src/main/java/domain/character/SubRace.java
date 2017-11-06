package domain.character;

import javax.persistence.*;

@Entity
public class SubRace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Race race;


}
