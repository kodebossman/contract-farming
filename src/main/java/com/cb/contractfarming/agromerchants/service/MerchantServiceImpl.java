package com.cb.contractfarming.agromerchants.service;

import com.cb.contractfarming.agromerchants.Merchant;
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
@Slf4j//Logging
@Transactional(propagation = Propagation.REQUIRED)

public class MerchantImpl implements MerchantService {
    private MerchantRepository merchantRepository;

    @Override
    public Merchant register(Merchant merchant) {
        log.info("Registering new merchant"+ merchant);
        return merchantRepository.save(merchant);
    }

    @Override
    public Optional<Merchant> findById(Long id) {
        log.info("Searching merchant by id"+ id);
        return merchantRepository.findById(id);
    }

    @Override
    public List<Merchant> findByName(String name) {
        log.info("Searching merchant by name"+ name);
        return merchantRepository.findByName(name);
    }

    @Override
    public List<Merchant> findByMsisdn(String msisdn) {
        log.info("Searching merchant by msisdn"+ msisdn);
        return merchantRepository.findByMsisdn(msisdn);
    }

    @Override
    public List<Merchant> findByLocation(String location) {
        log.info("Searching merchant by location"+ location);
        return merchantRepository.findByLocation(location);
    }

    @Override
    public List<Merchant> findByType(String type) {
        log.info("Searching merchant by Type"+ type);
        return merchantRepository.findByType(type);
    }

    @Override
    public Long total() {return null;}

    @Override
    public Merchant update(Merchant merchant) {
        log.info("Updating this Merchant"+merchant);
        return  merchantRepository.save(merchant);
    }

    @Override
    public List<Merchant> findAll(Pageable pageable) {
        return null;
    }
}