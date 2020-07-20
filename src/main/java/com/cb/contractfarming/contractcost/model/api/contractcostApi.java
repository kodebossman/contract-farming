package com.cb.contractfarming.contractcost.model.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.contractcost.model.ContractualCost;
import com.cb.contractfarming.contractcost.model.CostDto;
import com.cb.contractfarming.contractcost.model.service.ContractCostService;
import com.cb.contractfarming.project.ProjectDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/contract")

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


    @PostMapping(value = "/create")
    public ApiResponse<CostDto> create(CostDto costDto) {
        //log.info("contractual cost creation: {}", costDto);
        final ContractualCost contractualCost = ContractCostService.register(typeMapper.map(costDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractualCost));

    }
   /** public ApiResponse<PaginationResult<CostDto> > findById(@PathVariable(name = "name") Long Id){

        List<CostDto> costDtos =  contractCostService.findById(Id)
                .stream()
                .map(typeMapper::map)
                .collect(Collectors.toList());

        PaginationResult<CostDto> pagedcosts = PaginationResult.pagination(costDtos, contractCostService.total(), 1 , costDtos.size()-1);

        return new ApiResponse<>(HttpStatus.OK.value(), pagedcosts);
    }**/

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
