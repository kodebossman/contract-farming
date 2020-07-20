package com.cb.contractfarming.suppliers.services;

import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.suppliers.SupplierType;
import com.cb.contractfarming.suppliers.Suppliers;

import java.util.List;
import java.util.Optional;

public interface SuppliersService {
    Suppliers register(Suppliers suppliers);
    Optional<Suppliers> findById(Long Id);
    List<Suppliers> findBySuppliertype(SupplierType supplierType);
    List<Suppliers> findBySuppliername(String supplierName);
    List<Suppliers> findBySupplieraddress(String supplierAddress);
    List<Suppliers> findBySupplieremail(String supplierEmail);
    List<Suppliers> findBySupplierphone(int supplierPhone);
    List<Suppliers> findBySuppliercity(String supplierCity);
    List<Suppliers> findByFarmer(Farmer farmer);
    List<Suppliers> findByFarmerAndCity(Farmer farmer,String supplierCity);
}

