package com.cb.contractfarming.farmer.model.service;

import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FarmerRepository extends JpaRepository<Farmer,Long> {

  Optional<Farmer> findById(String id);

  Optional<Farmer> findByMsisdn(String lastName);

  List<Farmer> findByLastName(String lastName);

  List<Farmer> findByFirstName(String firstName);

  List<Farmer>findByFirstNameAndDistrict(String firstName, Long districtID);

  List<Farmer> findByFirstNameAndLastName(String firstName, String lastName);

}
