package com.cb.contractfarming.contractcost.model.service;

import com.cb.contractfarming.contractcost.model.ContractualCost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)

public class ContractualCostServiceImp implements ContractCostService {

    @Override
    public ContractualCost register(ContractualCost contractualCost) {
        return null;
    }

    @Override
    public Optional<ContractualCost> findByprice(Double price) {
        return Optional.empty();
    }

    @Override
    public List<ContractualCost> findByType(String type) {
        return null;
    }

    @Override
    public List<ContractualCost> findByContractId(String contract_id) {
        return null;
    }

    @Override
    public ContractualCost update(ContractualCost contractualCost) {
        return null;
    }

    @Override
    public List<ContractCostService> findAll(Pageable pageable) {
        return null;
    }
}
