package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContractorRepository extends JpaRepository<Contractor,Long> {

    Optional<Contractor> findById(Long id);

    List<Contractor> findByContractorEmail(String ContractorEmail);

    List<Contractor> findByContractorName(String contractorName);

    List<Contractor> findByContractorPhoneNumber(String phoneNumber);

    List<Contractor> findByContractorBankAccountNumber(String bankAccountNumber);


}