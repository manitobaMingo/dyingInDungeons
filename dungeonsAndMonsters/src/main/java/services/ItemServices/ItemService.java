package services.ItemServices;

import domain.items.Item;

public interface ItemService {

    Item getItemById(Integer id);

    Item saveItem(Item item);

    Iterable<Item> listAllItems();

    void deleteItem(Integer id);
}
