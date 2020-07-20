package com.cb.contractfarming.contractcost.model.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.ContractualCostDto;
import com.cb.contractfarming.contractcost.model.service.ContractCostService;
import com.cb.contractfarming.exception.BusinessException;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/costing")

public class ContractractualCostApi implements CrudApi<ContractualCostDto> {
  private ContractCostService contractCostService;
  private TypeMapper typeMapper;


  @PostMapping( value = "/register")
  public ApiResponse<ContractualCostDto> register(@Valid @RequestBody ContractualCostDto contractualCostDto) {
    log.info("contractual cost registration: {}", contractualCostDto);
    final ContractualCost contractualCost = contractCostService.register(typeMapper.map(contractualCostDto));
    return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));
  }


  @PostMapping(value = "/create")
  public ApiResponse<ContractualCostDto> create(ContractualCostDto contractualCostDto) {
    log.info("contractual cost creation: {}"+ contractualCostDto);
    final ContractualCost contractualCost = contractCostService.register(typeMapper.map(contractualCostDto));
    return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));

  }
  @GetMapping(value = "/find/{id}")
  public ApiResponse<ContractualCostDto> findById(@PathVariable(name = "id") final Long id) {
    final Optional<ContractualCost> contractualCost = contractCostService.findById(id);
    return contractualCost.map(contractualCost1 -> new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost1)))
      .orElseThrow(() -> new BusinessException("Contractual cost " + id + "not found"));
  }

  @Override
  public ApiResponse<ContractualCostDto> update(ContractualCostDto contractualCostDto) {
    log.info("contractual cost creation: {}"+ contractualCostDto);
    final ContractualCost contractualCost = contractCostService.register(typeMapper.map(contractualCostDto));
    return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));

  }

  @Override
  public ApiResponse<ContractualCostDto> delete(ContractualCostDto contractualCostDto) {
    return null;
  }

  @Override
  public ApiResponse<PaginationResult<ContractualCostDto>> findAll(String search, Integer page, Integer size, String sortBy) {
    return null;
  }

  @Override
  public ApiResponse<ContractualCostDto> find(Long id) {
    return null;
  }
}
