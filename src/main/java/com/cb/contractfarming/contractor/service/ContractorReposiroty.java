package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContractorReposiroty extends JpaRepository<Contractor,Long> {

    List<Contractor> findBycontractorName(String name);

    List<Contractor> findById(int id);

    List<Contractor> findByEmail(String email);

    List<Contractor> findByBankAccountNumber(String bankAccountNumber);

    List<Contractor> findByPhoneNumber(String bankAccountNumber);
}
