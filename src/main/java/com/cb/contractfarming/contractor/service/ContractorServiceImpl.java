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
public class ContractorServiceImpl implements ContractorService {

    private final ContractorRepository contractorRepository;

    @Override
    public Contractor register(Contractor contractor) {
        log.info("Registering a new contract: {}" + contractor);
        return contractorRepository.save(contractor);
    }

    @Override
    public Contractor update(Contractor contractor) {
        return null;
    }

    @Override
    public Long total() {
        return null;
    }

    @Override
    public List<Contractor> findByContractorName(String name) {
        return contractorRepository.findByContractorName(name);
    }

    @Override
    public Optional<Contractor> findById(Long id) {
        return contractorRepository.findById(id);
    }

    @Override
    public List<Contractor> findByContractorEmail(String email) {
        return null;
    }

    @Override
    public List<Contractor> findByContractorBankAccountNumber(String bankAccountNumber) {
        return null;
    }

    @Override
    public List<Contractor> findByContractorPhoneNumber(String bankAccountNumber) {
        return null;
    }

    @Override
    public List<Contractor> findAll(Pageable pageable) {
        return null;
    }
}