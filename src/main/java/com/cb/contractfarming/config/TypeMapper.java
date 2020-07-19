package com.cb.contractfarming.config;


import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.contract.ContractDto;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.contractor.ContractorDto;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TypeMapper {

  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);

  Contractor map(ContractorDto contractorDto);

  ContractorDto map(Contractor contractor);

  Contract map(ContractDto contractDto);

  ContractDto map(Contract contract);


}

