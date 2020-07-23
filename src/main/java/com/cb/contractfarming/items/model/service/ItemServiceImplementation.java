package com.cb.contractfarming.items.model.service;

import com.cb.contractfarming.items.model.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation = Propagation.REQUIRED)

public class ItemServiceImplementation implements ItemService{

    private ItemRepository itemRepository;
    @Override
    public Item register(Item item) {


        log.info("Registering the Item with "+ item);
        return itemRepository.save(item);
    }

    @Override
    public Optional<Item> findBySerialNo(String serialNo) {

        log.info("Searching items of serialNo "+ serialNo);
        return itemRepository.findBySerialNo(serialNo);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public Optional<Item> findByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public List<Item> findByPrice(Double price) {
        return itemRepository.findByPrice(price);
    }

    @Override
    public List<Item> findByPriceAndQuantity(Double price, Integer quantity) {
        return null;
    }

    @Override
    public List<Item> findByNameAndPrice(String name, Double price) {
        return findByFirstNameAndPrice(name,price);
    }

    private List<Item> findByFirstNameAndPrice(String name, Double price) {
        return null;
    }

    @Override
    public Long total() {
        return itemRepository.count();
    }

    @Override
    public Item update(Item items) {

        log.info("Updating this item "+items);
        return  itemRepository.save(items);
    }

    @Override
    public List<Item> findAll(Pageable pageable) {
        return itemRepository.findAll(pageable).getContent();
    }
}