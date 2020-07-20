package com.cb.contractfarming.contractcost.model.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostDto;
import com.cb.contractfarming.contractcost.model.service.ContractCostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/contractcost.model")

public class contractcostApi implements CrudApi<CostDto> {
    private ContractCostService contractCostService;
    private TypeMapper typeMapper;

    public contractcostApi(ContractCostService contractCostService, TypeMapper typeMapper) {
        this.contractCostService = contractCostService;
        this.typeMapper = typeMapper;
    }

    @PostMapping( value = "/register")
    public ApiResponse<CostDto> register(@Valid @RequestBody CostDto costDto) {
        //log.info("contractual cost registration: {}", costDto);
        final ContractualCost contractualCost = ContractCostService.register(typeMapper.map(costDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));
    }


    @Override
    public ApiResponse<CostDto> create(CostDto costDto) {
        //log.info("contractual cost creation: {}", costDto);
        final ContractualCost contractualCost = ContractCostService.register(typeMapper.map(costDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));

    }

    @Override
    public ApiResponse<CostDto> update(CostDto costDto) {
        //log.info("contractual cost creation: {}", costDto);
        final ContractualCost contractualCost = ContractCostService.register(typeMapper.map(costDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));

    }

    @Override
    public ApiResponse<CostDto> delete(CostDto costDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<CostDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<CostDto> find(Long id) {
        return null;
    }
}
