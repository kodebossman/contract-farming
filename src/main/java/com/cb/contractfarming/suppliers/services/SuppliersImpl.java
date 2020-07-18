package com.cb.contractfarming.suppliers.services;

import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.suppliers.Suppliers;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class SuppliersImpl implements SuppliersService{


    @Override
    public Optional<Suppliers> findById(Long Id) {
        return Optional.empty();
    }

    @Override
    public List<Suppliers> findBySuppliername(String supplierName) {
        return null;
    }

    @Override
    public List<Suppliers> findBySupplieraddress(String supplierAddress) {
        return null;
    }

    @Override
    public List<Suppliers> findBySupplieremail(String supplierEmail) {
        return null;
    }

    @Override
    public List<Suppliers> findBySupplierphone(int supplierPhone) {
        return null;
    }

    @Override
    public List<Suppliers> findBySuppliercity(String supplierCity) {
        return null;
    }

    @Override
    public List<Suppliers> findByFarmer(Farmer farmer) {
        return null;
    }

    @Override
    public List<Suppliers> findByFarmerAndCity(Farmer farmer, String supplierCity) {
        return null;
    }
}
