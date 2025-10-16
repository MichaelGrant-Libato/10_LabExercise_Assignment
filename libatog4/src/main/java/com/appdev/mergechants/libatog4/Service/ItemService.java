package com.appdev.mergechants.libatog4.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appdev.mergechants.libatog4.Entity.ItemEntity;
import com.appdev.mergechants.libatog4.Repository.ItemRepository;
import java.util.List;

@Service
public class ItemService {

  @Autowired
  private ItemRepository repo;

  public List<ItemEntity> getAllItems() {
    return repo.findAll();
  }

  public ItemEntity getItemById(String item_id) {
    return repo.findById(item_id).orElse(null);
  }

  public ItemEntity createListing(ItemEntity item) {
    item.createListing();
    return repo.save(item);
  }

  public ItemEntity updateItemStatus(String item_id, String newStatus) {
    ItemEntity item = getItemById(item_id);
    if (item != null) {
      item.updateItemStatus(newStatus);
      return repo.save(item);
    }
    return null;
  }

  public ItemEntity updateItem(String item_id, ItemEntity updatedItem) {
    ItemEntity item = getItemById(item_id);
    if (item != null) {
      item.setTitle(updatedItem.getTitle());
      item.setCategory(updatedItem.getCategory());
      item.setDescription(updatedItem.getDescription());
      item.setPrice(updatedItem.getPrice());
      item.setStatus(updatedItem.getStatus());
      return repo.save(item);
    }
    return null;
  }

  public void deleteItem(String item_id) {
    repo.deleteById(item_id);
  }
}
