package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Item;

public interface ItemService {

    Item getItemById(Integer id);

    Item saveItem(Item item);

    Iterable<Item> listAllItems();

    void deleteItem(Integer id);
}
