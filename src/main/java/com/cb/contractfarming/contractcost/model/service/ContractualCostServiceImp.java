package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation = Propagation.REQUIRED)

public class ContractualCostServiceImp implements ContractCostService {

  private ContractualCostRepository contractualCostRepository;
    @Override
    public ContractualCost register(ContractualCost contractualCost) {
      log.info("Registering the Farmer with "+ contractualCost);
      return contractualCostRepository.save(contractualCost);
    }
  @Override
  public Optional<ContractualCost> findById(Long id) {
    return contractualCostRepository.findById(id);
  }
  @Override
  public List<ContractualCost> findByChargeDate(LocalDateTime chargeDate) {
    return contractualCostRepository.findByChargeDate(chargeDate);
  }
  @Override
  public Long total() {
    return contractualCostRepository.count();
  }
  @Override
  public ContractualCost update(ContractualCost contractualCost) {
      log.info("Updating contractual cost cost "+contractualCost);
      return  contractualCostRepository.save(contractualCost);
  }
  @Override
  public List<ContractualCost> findAll(Pageable pageable) {
    return contractualCostRepository.findAll(pageable).getContent();
  }


}



