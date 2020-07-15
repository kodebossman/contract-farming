package com.cb.contractfarming.contract.service;

import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ContractRepository extends JpaRepository<Contract, Long> {

    Optional<Contract> findById(String id);

    Optional<Contract> findByContractName(String contractName);

    List<Contract> findByDateSigned(LocalDateTime dateSigned);

    List<Contract> findByContractor(Contractor contractor);

    List<Contract> findByFarmer(Farmer farmer);

    List<Contract> findByFarmerAndAndContractor(Farmer farmer, Contractor contractor);

}
