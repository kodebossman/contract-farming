package com.cb.contractfarming.items.service;

import com.cb.contractfarming.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item,Long> {




   Optional<Item> findBySerialNo(String name);
    Optional<Item> findByName(String name);
    List<Item> findByPrice(Double price);
    List<Item>findByQuantity(Integer quality);
    List<Item> findByNameAndQuantity(String name, Integer quality);

}

