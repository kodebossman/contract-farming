package com.cb.contractfarming.products.service;

import com.cb.contractfarming.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByProductName(String productName);
    List<Product> findByProductDesc(String productDesc);
    List<Product> findByProductPrice(Double productPrice);
    List<Product> findByProductType(String ProductType);
    List<Product> findByProductNameAndProductType(String productName ,String productType);
    List<Product> findByProductNameAndProductDesc(String productName, String productDesc);
}



