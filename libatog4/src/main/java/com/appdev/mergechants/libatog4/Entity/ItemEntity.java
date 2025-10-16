package com.appdev.mergechants.libatog4.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "item_entity")
public class ItemEntity {
  @Id
  private String item_id;
  private String title;
  private String category;
  private String description;
  private Float price;
  private String status;

  public ItemEntity() {
  }

  public ItemEntity(String item_id, String title, String category, String description, Float price, String status) {
    this.item_id = item_id;
    this.title = title;
    this.category = category;
    this.description = description;
    this.price = price;
    this.status = status;
  }

  public String getItem_id() {
    return item_id;
  }

  public void setItem_id(String item_id) {
    this.item_id = item_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  // Custom Methods
  public void createListing() {
    this.status = "Listed";
  }

  public void updateItemStatus(String newStatus) {
    this.status = newStatus;
  }

  public String displayItemInfo() {
    return "Item ID: " + item_id + "\nTitle: " + title + "\nCategory: " + category +
        "\nDescription: " + description + "\nPrice: " + price + "\nStatus: " + status;
  }
}
