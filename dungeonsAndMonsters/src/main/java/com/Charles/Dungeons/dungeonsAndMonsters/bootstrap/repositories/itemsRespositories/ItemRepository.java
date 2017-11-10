package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
