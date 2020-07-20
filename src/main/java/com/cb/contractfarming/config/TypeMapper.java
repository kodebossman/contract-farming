package com.cb.contractfarming.config;


import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostDto;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.suppliers.Suppliers;
import com.cb.contractfarming.suppliers.SuppliersDto;
import com.cb.contractfarming.items.Item;
import com.cb.contractfarming.items.ItemsDTO;
import com.cb.contractfarming.project.Project;
import com.cb.contractfarming.project.ProjectDto;
import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.agromerchants.MerchantDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")

public interface  TypeMapper {

    Farmer map(FarmerDto farmerDto);
    FarmerDto map(Farmer farmer);
    Item map(ItemsDTO itemsDTO);
    ItemsDTO map(Item it
    Contractor map(ContractualCost contractorDto);
     ContractualCost map(@Valid CostDto contractor);
  Project map(ProjectDto projectDto);
  ProjectDto map(Project project);
    Suppliers map(SuppliersDto suppliersDto);
  SuppliersDto map(Suppliers suppliers);
   Merchant map (MerchantDto merchantDto);
  MerchantDto map(Merchant merchant);
}

