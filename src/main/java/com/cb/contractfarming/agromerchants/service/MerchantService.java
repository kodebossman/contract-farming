package com.cb.contractfarming.agromerchants.service;

import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MerchantService {
    Merchant register(Merchant merchant);

    Optional<Merchant> findById(Long id);

    List<Merchant> findByName(String name);

    List<Merchant> findByMsisdn(String msisdn);

    List<Merchant>findByLocation(String location);

    List<Merchant> findByType(String type);

    Long total();

    Merchant update(Merchant merchant);


    List<Merchant> findAll(Pageable pageable);
}