package com.cb.contractfarming.products.service;

import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.products.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product register(Product product);
    Optional<Product> findByProductNname(String ProductNname);

    List<Product> findByProductDesc(String ProductDesc);

    List<Product> findByProductPrice(Double ProductPrice);

    List<Product> findByProductType(String ProductType);
    List<Product> findByProductNnameAndProductType(String ProductNname ,String ProductType);

    List<Product> findByProductNnameAndAndProductDesc(String ProductNname, String ProductDesc);
    Long total();
    Product update(Farmer farmer);
    List<Product> findAll(Pageable pageable);






}
