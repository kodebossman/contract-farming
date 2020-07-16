package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostType;
import com.cb.contractfarming.contractor.ContractorType;
import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ContractualCostRepository extends JpaRepository<ContractualCost, Long> {

  Optional<ContractualCost> findById(Long Id);
  List<ContractualCost> findByChargeDate(LocalDateTime chargeDate);
  List<ContractualCost> findByCostType(String type);


}
