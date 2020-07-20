package com.cb.contractfarming.suppliers.services;

import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.products.Product;
import com.cb.contractfarming.suppliers.SupplierType;
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

    private SuppliersRepository suppliersRepository;
    @Override
    public Suppliers register(Suppliers suppliers) {
        log.info("Registering the Supplier "+ suppliers);
        return suppliersRepository.save(suppliers);
    }

    @Override
    public Optional<Suppliers> findById(Long Id) {
        return suppliersRepository.findById(Id);

    }

    @Override
    public List<Suppliers> findBySuppliertype(SupplierType supplierType) {
        return suppliersRepository.findBySuppliertype(supplierType);
    }

    @Override
    public List<Suppliers> findBySuppliername(String supplierName) {
        return suppliersRepository.findBySuppliername(supplierName);
    }

    @Override
    public List<Suppliers> findBySupplieraddress(String supplierAddress) {
        return suppliersRepository.findBySupplieraddress(supplierAddress);
    }

    @Override
    public List<Suppliers> findBySupplieremail(String supplierEmail) {
        return suppliersRepository.findBySupplieremail(supplierEmail);
    }

    @Override
    public List<Suppliers> findBySupplierphone(int supplierPhone) {
        return suppliersRepository.findBySupplierphone(supplierPhone);
    }

    @Override
    public List<Suppliers> findBySuppliercity(String supplierCity) {
        return suppliersRepository.findBySuppliercity(supplierCity);
    }

    @Override
    public List<Suppliers> findByFarmer(Farmer farmer) {
        return suppliersRepository.findByFarmer(farmer);
    }

    @Override
    public List<Suppliers> findByFarmerAndCity(Farmer farmer, String supplierCity) {
        return suppliersRepository.findByFarmerAndCity(farmer,supplierCity);
    }
}
