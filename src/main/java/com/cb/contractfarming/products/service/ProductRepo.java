package com.cb.contractfarming.products.service;

import com.cb.contractfarming.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Optional<Product> findByProductNname(String ProductNname);

    List<Product> findByProductDesc(String ProductDesc);

    List<Product> findByProductPrice(Double ProductPrice);

    List<Product> findByProductType(String ProductType);
    List<Product> findByProductNnameAndProductType(String ProductNname ,String ProductType);

    List<Product> findByProductNnameAndAndProductDesc(String ProductNname, String ProductDesc);
}



