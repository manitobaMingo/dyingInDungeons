package com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.serviceImplementations.itemServiceImplementations;

import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.domain.items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.repositories.itemsRespositories.ItemRepository;
import com.Charles.Dungeons.dungeonsAndMonsters.bootstrap.services.ItemServices.ItemService;

public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository){this.itemRepository = itemRepository;}


    @Override
    public Item getItemById(Integer id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Iterable<Item> listAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public void deleteItem(Integer id) {
        itemRepository.delete(id);
    }
}
