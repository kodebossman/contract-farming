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
@Transactional(propagation = Propagation.REQUIRED)

public class ProductImpl implements ProductService {

  private ProductRepository productRepository;
    @Override
    public Product register(Product product) {
        log.info("Registering the Product with"+ product);
       return productRepository.save(product);
    }

    @Override
    public Optional<Product> findByProductName(String productName) {

      return productRepository.findByProductName(productName);
    }

    @Override
    public List<Product> findByProductDesc(String productDesc) {
        return productRepository.findByProductDesc(productDesc);
    }

    @Override
    public List<Product> findByProductPrice(Double productPrice) {

      return productRepository.findByProductPrice(productPrice);
    }

    @Override
    public List<Product> findByProductType(String productType) {
        return productRepository.findByProductType(productType);
    }

    @Override
    public List<Product> findByProductNameAndProductType(String productName, String productType) {


      return productRepository.findByProductNameAndProductType(productName,productType);
    }

    @Override
    public List<Product> findByProductNameAndAndProductDesc(String productName, String productDesc) {
        return productRepository.findByProductNameAndProductDesc(productName,productDesc);
    }

    @Override
    public Long total() {
        return productRepository.count();
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable).getContent();
    }
}
