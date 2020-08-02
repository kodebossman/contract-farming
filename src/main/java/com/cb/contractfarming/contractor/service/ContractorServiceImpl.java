package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.contractor.Contractor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation = Propagation.REQUIRED)

public class ContractorServiceImpl implements ContractorService {

  private final ContractorRepository contractorRepository;

  @Override
  public Contractor register(Contractor contractor) {
    return contractorRepository.save(contractor);
  }

  @Override
  public long total() {
    return contractorRepository.count();
  }

  @Override
  public Optional<Contractor> findByContractorId(String contractorId) {
    return contractorRepository.findByContractorId(contractorId);
  }

  @Override
  public List<Contractor> findByName(String name) {
    return contractorRepository.findByName(name);
  }

  @Override
  public Optional<Contractor> findById(Long id) {
    return contractorRepository.findById(id);
  }

  public void  deleteContractor(Long contractorId){
    contractorRepository.deleteById(contractorId);
  }

  @Override
  public List<Contractor> findByEmail(String email) {

    return contractorRepository.findByEmail(email);
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
