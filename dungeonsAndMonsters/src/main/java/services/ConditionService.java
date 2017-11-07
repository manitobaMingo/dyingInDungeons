package services;

import domain.Condition;

public interface ConditionService {

    Condition getConditionById(Integer id);

    Condition saveCondition(Condition condition);

    Iterable listAllConditions();

    void deleteCondition(Integer id);

}
