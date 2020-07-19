package com.cb.contractfarming.config;


import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.suppliers.Suppliers;
import com.cb.contractfarming.suppliers.SuppliersDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TypeMapper {

  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);
  Suppliers map(SuppliersDto suppliersDto);
  SuppliersDto map(Suppliers suppliers);


}

