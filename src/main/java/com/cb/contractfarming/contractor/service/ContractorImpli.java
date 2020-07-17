package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.domain.Pageable;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation = Propagation.REQUIRED)
public class ContractorImpli implements ContactorService {

    private final ContractorReposiroty contractorReposiroty;

    @Override
    public Contractor register(Contractor contractor) {
        log.info("Registering a new contract: {}" + contractor);
        return contractorReposiroty.save(contractor);
    }

    @Override
    public List<Contractor> findByContractorName(String name) {
        return contractorReposiroty.findByContractorName(name);
    }

    @Override
    public Optional<Contractor> findById(Long id) {
        return contractorReposiroty.findById(id);
    }

    @Override
    public List<Contractor> findByEmail(String email) {
        return null;
    }

    @Override
    public List<Contractor> findByBankAccountNumber(String bankAccountNumber) {
        return null;
    }

    @Override
    public List<Contractor> findByPhoneNumber(String bankAccountNumber) {
        return null;
    }

    @Override
    public List<Contractor> findAll(Pageable pageable) {
        return null;
    }
}
