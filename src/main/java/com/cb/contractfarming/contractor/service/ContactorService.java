package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContactorService {


    List<Contractor> findBycontractorName(String name);

    List<Contractor> findById(int id);

    List<Contractor> findByEmail(String email);

    List<Contractor> findByBankAccountNumber(String bankAccountNumber);

    List<Contractor> findByPhoneNumber(String bankAccountNumber);

    List<Contractor> findAll(Pageable pageable);
}
