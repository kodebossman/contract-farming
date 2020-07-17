package com.cb.contractfarming.config;


import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.items.Item;
import com.cb.contractfarming.items.ItemsDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface  TypeMapper {

  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);


  Item map(ItemsDTO itemsDTO);
  ItemsDTO map(Item item);
}

