package com.cb.contractfarming.farmer.model.service;

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

public class FarmerServiceImpl implements FarmerService{

  private FarmerRepository farmerRepository;
  @Override
  public Farmer register(Farmer farmer) {

    log.info("Registering the Farmer with "+ farmer);
   return farmerRepository.save(farmer);
  }

  @Override
  public Optional<Farmer> findByMsisdn(String msisdn) {

     log.info("Searching farmer of msisdn "+ msisdn);
    return farmerRepository.findByMsisdn(msisdn);
  }

  @Override
  public Optional<Farmer> findById(Long id) {
    return farmerRepository.findById(id);
  }

  @Override
  public List<Farmer> findByLastName(String lastName) {
    return farmerRepository.findByLastName(lastName);
  }

  @Override
  public List<Farmer> findByFirstName(String firstName) {
    return farmerRepository.findByFirstName(firstName);
  }

  @Override
  public List<Farmer> findByFirstNameAndLastName(String firstName, String lastName) {
    return findByFirstNameAndLastName(firstName,lastName);
  }

  @Override
  public Long total() {
    return farmerRepository.count();
  }

  @Override
  public Farmer update(Farmer farmer) {

    log.info("Updating this farmer "+farmer);
    return  farmerRepository.save(farmer);
  }

  @Override
  public List<Farmer> findAll(Pageable pageable) {
    return farmerRepository.findAll(pageable).getContent();
  }
}
