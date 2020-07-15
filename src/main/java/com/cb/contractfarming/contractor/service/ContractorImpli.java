package com.cb.contractfarming.contractor.service;

import com.cb.contractfarming.contractor.Contractor;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ContractorImpli implements ContactorService {
    @Override
    public List<Contractor> findBycontractorName(String name) {
        return null;
    }

    @Override
    public List<Contractor> findById(int id) {
        return null;
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
