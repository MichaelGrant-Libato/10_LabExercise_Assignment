package com.appdev.mergechants.libatog4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.appdev.mergechants.libatog4.Entity.ItemEntity;
import com.appdev.mergechants.libatog4.Service.ItemService;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

  @Autowired
  private ItemService service;

  @GetMapping
  public List<ItemEntity> getAllItems() {
    return service.getAllItems();
  }

  @GetMapping("/{item_id}")
  public ItemEntity getItemById(@PathVariable String item_id) {
    return service.getItemById(item_id);
  }

  @PostMapping
  public ItemEntity createItem(@RequestBody ItemEntity item) {
    return service.createListing(item);
  }

  @PutMapping("/{item_id}")
  public ItemEntity updateItem(@PathVariable String item_id, @RequestBody ItemEntity updatedItem) {
    return service.updateItem(item_id, updatedItem);
  }

  @PatchMapping("/{item_id}/status")
  public ItemEntity updateItemStatus(@PathVariable String item_id, @RequestParam String status) {
    return service.updateItemStatus(item_id, status);
  }

  @DeleteMapping("/{item_id}")
  public void deleteItem(@PathVariable String item_id) {
    service.deleteItem(item_id);
  }

  @GetMapping("/{item_id}/info")
  public String displayItemInfo(@PathVariable String item_id) {
    ItemEntity item = service.getItemById(item_id);
    return item != null ? item.displayItemInfo() : "Item not found";
  }
}
