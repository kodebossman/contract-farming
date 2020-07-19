package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ContractorService {


    Contractor register(Contractor contractor);

    Contractor update(Contractor contractor);

    Long total();

    Optional<Contractor> findById(Long id);

    List<Contractor> findByContractorName(String name);

    List<Contractor> findByContractorEmail(String email);

    List<Contractor> findByContractorBankAccountNumber(String bankAccountNumber);

    List<Contractor> findByContractorPhoneNumber(String bankAccountNumber);

    List<Contractor> findAll(Pageable pageable);
}