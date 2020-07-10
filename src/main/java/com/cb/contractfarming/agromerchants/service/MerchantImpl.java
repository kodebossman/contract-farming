package com.cb.contractfarming.agromerchants.service;

import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.farmer.model.Farmer;
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

public class MerchantImpl implements MerchantService {
    @Override
    public Merchant register(Merchant merchant) {
        return null;
    }

    @Override
    public Optional<Merchant> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Merchant> findByName(String name) {
        return null;
    }

    @Override
    public List<Merchant> findByMsisdn(String msisdn) {
        return null;
    }

    @Override
    public List<Merchant> findByLocation(String location) {
        return null;
    }

    @Override
    public List<Merchant> findByType(String type) {
        return null;
    }

    @Override
    public Long total() {
        return null;
    }

    @Override
    public Merchant update(Merchant merchant) {
        return null;
    }

    @Override
    public List<Merchant> findAll(Pageable pageable) {
        return null;
    }
}
