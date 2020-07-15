package com.cb.contractfarming.contract.service;

import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ContractServiceImpl implements ContractService {

    private ContractRepository contractRepository;

    @Override
    public Contract register(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Optional<Contract> findById(Long id) {
        return contractRepository.findById(id);
    }

    @Override
    public Optional<Contract> findByContractName(String contractName) {
        return contractRepository.findByContractName(contractName);
    }

    @Override
    public List<Contract> findByDateSigned(LocalDateTime dateSigned) {
        return contractRepository.findByDateSigned(dateSigned);
    }

    @Override
    public List<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll();
    }

    @Override
    public Long total() {
        return contractRepository.count();
    }

    @Override
    public Contract update(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contract> findByContractor(Contractor contractor) {
        return contractRepository.findByContractor(contractor);
    }

    @Override
    public List<Contract> findByFarmer(Farmer farmer) {
        return contractRepository.findByFarmer(farmer);
    }

    @Override
    public List<Contract> findByFarmerAndAndContractor(Farmer farmer, Contractor contractor) {
        return findByFarmerAndAndContractor(farmer, contractor);
    }
}
