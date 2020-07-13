package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostType;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface ContractCostService {
  ContractualCost register (ContractualCost contractualCost);
  Optional<ContractualCost> findByprice(Double price);
  List<ContractualCost> findByType(String type);
  List<ContractualCost> findByContractId(String contract_id);
   ContractualCost update(ContractualCost contractualCost);
   List<ContractCostService> findAll(Pageable pageable);
}
