package com.cb.contractfarming.config;


import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostDto;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.project.Project;
import com.cb.contractfarming.project.ProjectDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TypeMapper {

  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);

  Contractor map(ContractualCost contractorDto);

  ContractualCost map(@Valid CostDto contractor);


  Project map(ProjectDto projectDto);
  ProjectDto map(Project project);
}

