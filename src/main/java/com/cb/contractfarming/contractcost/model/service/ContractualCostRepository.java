package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface  ContractualCostRepository extends JpaRepository<ContractualCost, Long> {

  Optional<ContractualCost> findById(Long Id);
  List<ContractualCost> findByChargeDate(LocalDateTime chargeDate);
  List<ContractualCost> findByCostType(String type);


}
