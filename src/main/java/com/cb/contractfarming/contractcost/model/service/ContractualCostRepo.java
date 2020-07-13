package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostType;
import com.cb.contractfarming.contractor.ContractorType;
import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface ContractualCostRepo  extends JpaRepository<ContractualCost, Long> {

    //Optional<ContractorType> findByContractorType(String type);
    Optional<ContractualCost> findByCurrency(String currency);
   // Optional<ContractualCost> findByPrice(Double price);
   // Optional<ContractualCost> findByContractName(String name);
    //Optional<ContractualCost> findByContractType(String type);
    List<CostType> findByCostType(String type);
    
    //List<ContractualCost> findAll(Pageable pageable);

}
