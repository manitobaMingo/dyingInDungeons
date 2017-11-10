package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.ConditionRepository;
@Service
public class ConditionServiceImpl implements ConditionService {

    private final ConditionRepository conditionRepository;
    @Autowired
    public ConditionServiceImpl(ConditionRepository conditionRepository){this.conditionRepository = conditionRepository;}

    @Override
    public Condition getConditionById(Integer id) {
        return conditionRepository.findOne(id);
    }

    @Override
    public Condition saveCondition(Condition condition) {
        return conditionRepository.save(condition);
    }

    @Override
    public Iterable listAllConditions() {
        return conditionRepository.findAll();
    }

    @Override
    public void deleteCondition(Integer id) {
        conditionRepository.delete(id);
    }
}
