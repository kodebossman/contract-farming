package com.cb.contractfarming.products.service;

import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.products.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation= Propagation.REQUIRED)

public class ProductImple implements ProductService {
    private ProductRepo productRepo;
    @Override
    public Product register(Product product) {
        log.info("Registering the Product with"+ product);
        productRepo.save(product)
    }

    @Override
    public Optional<Product> findByProductNname(String ProductNname) {
        return Optional.empty();
    }

    @Override
    public List<Product> findByProductDesc(String ProductDesc) {
        return null;
    }

    @Override
    public List<Product> findByProductPrice(Double ProductPrice) {
        return null;
    }

    @Override
    public List<Product> findByProductType(String ProductType) {
        return null;
    }

    @Override
    public List<Product> findByProductNnameAndProductType(String ProductNname, String ProductType) {
        return null;
    }

    @Override
    public List<Product> findByProductNnameAndAndProductDesc(String ProductNname, String ProductDesc) {
        return null;
    }

    @Override
    public Long total() {
        return null;
    }

    @Override
    public Product update(Farmer farmer) {
        return null;
    }

    @Override
    public List<Product> findAll(Pageable pageable) {
        return null;
    }
}
