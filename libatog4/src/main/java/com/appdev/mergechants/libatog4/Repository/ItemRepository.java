package com.appdev.mergechants.libatog4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.appdev.mergechants.libatog4.Entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, String> {
}
