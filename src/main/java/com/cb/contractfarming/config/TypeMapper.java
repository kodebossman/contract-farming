package com.cb.contractfarming.config;


import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.contract.ContractDto;
import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.ContractualCostDto;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.contractor.ContractorDto;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.items.Item;
import com.cb.contractfarming.items.ItemsDTO;
import com.cb.contractfarming.project.Project;
import com.cb.contractfarming.project.ProjectDto;

import com.cb.contractfarming.suppliers.Suppliers;
import com.cb.contractfarming.suppliers.SuppliersDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface  TypeMapper {
    Farmer map(FarmerDto farmerDto);
    FarmerDto map(Farmer farmer);
    Item map(ItemsDTO itemsDTO);
    ItemsDTO map(Item item);
    ContractualCost map(ContractualCostDto contractualCostDto);
    ContractualCostDto map(ContractualCost contractualCost);
    Project map(ProjectDto projectDto);
    ProjectDto map(Project project);
    Contractor map(ContractorDto contractorDto);
    ContractorDto map( Contractor contractor);
    Contract map(ContractDto contractDto);
    ContractDto map(Contract contract);
    Suppliers map(SuppliersDto suppliersDto);
    SuppliersDto map(Suppliers suppliers);

}

