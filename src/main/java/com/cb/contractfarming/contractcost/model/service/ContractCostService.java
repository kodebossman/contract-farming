package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ContractCostService {
  static ContractualCost register(ContractualCost contractualCost);
  Optional<ContractualCost> findById(Long id);
  List<ContractualCost> findByChargeDate(LocalDateTime chargeDate);
  Long total();
  ContractualCost update(ContractualCost contractualCost);
  List<ContractualCost> findAll(Pageable pageable);
}
