package com.cb.contractfarming.contract.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.contract.ContractDto;
import com.cb.contractfarming.contract.service.ContractService;
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
@RequestMapping("/contract")
public class ContractApi implements CrudApi<ContractDto> {

    private final ContractService contractService;
    private final TypeMapper mapper;

    @PostMapping(value = "/register")
    public ApiResponse<ContractDto> register(@Valid @RequestBody ContractDto contractDto){
        log.info("New contract registration: {}", contractDto);
        final Contract contract = contractService.register(mapper.map(contractDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(contract));

    }

    @Override
    @PostMapping(value = "/create")
    public ApiResponse<ContractDto> create(@Valid @RequestBody ContractDto contractDto) {
        log.info("New contract registration: {}", contractDto);
        final Contract contract = contractService.register(mapper.map(contractDto));
        return new ApiResponse<>(HttpStatus.OK.value(), mapper.map(contract));
    }

    @Override
    public ApiResponse<ContractDto> update(ContractDto contractDto) {
        return null;
    }

    @Override
    public ApiResponse<ContractDto> delete(ContractDto contractDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ContractDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ContractDto> find(Long id) {
        return null;
    }
}