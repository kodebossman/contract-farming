package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ContractorService {


  public List<Contractor> findByName(String name);

    Optional<Contractor> findById(Long id);

    List<Contractor> findByEmail(String email);

    List<Contractor> findByBankAccountNumber(String bankAccountNumber);

    List<Contractor> findByPhoneNumber(String bankAccountNumber);

    List<Contractor> findAll(Pageable pageable);

   Contractor register(Contractor map);

  long total();

  void  deleteContractor(Long contractorId);

  Optional<Contractor> findByContractorId(String contractorId);
}
