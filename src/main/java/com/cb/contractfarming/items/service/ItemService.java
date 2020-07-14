package com.cb.contractfarming.items.service;

import com.cb.contractfarming.items.Item;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item register(Item item);

    Optional<Item> findBySerialNo(String serialNo);

    Optional<Item> findById(Long id);

    List<Item> findByName(String name);

    List<Item> findByPrice(Double price);

    List<Item> findByPriceAndQuantity(Double price, Integer quantity);

    List<Item> findByNameAndPrice(String name, Double price);

    Long total();

    Item update(Item item);


    List<Item> findAll(Pageable pageable);
}
