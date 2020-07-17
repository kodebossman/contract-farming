package com.cb.contractfarming.contract.service;

import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ContractService {

    Contract register(Contract contract);

    Optional<Contract> findById(Long id);

    Optional<Contract> findByContractName(String contractName);

    List<Contract> findByDateSigned(LocalDate dateSigned);

    List<Contract> findAll(Pageable pageable);

    Long total();

    Contract update(Contract contract);

    List<Contract> findByContractor(Contractor contractor);

    List<Contract> findByFarmer(Farmer farmer);

    List<Contract> findByFarmerAndAndContractor(Farmer farmer, Contractor contractor);

}
