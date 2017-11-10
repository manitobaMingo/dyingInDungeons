package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.Condition;

public interface ConditionService {

    Condition getConditionById(Integer id);

    Condition saveCondition(Condition condition);

    Iterable listAllConditions();

    void deleteCondition(Integer id);

}
