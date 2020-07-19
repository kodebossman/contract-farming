package com.cb.contractfarming.contractor.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.contractor.ContractorDto;
import com.cb.contractfarming.contractor.service.ContractorService;
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
@RequestMapping("/contractor")
public class ContractorApi implements CrudApi<ContractorDto> {

    private final ContractorService contractorService;
    private final TypeMapper typeMapper;


    @PostMapping(value = "/register")
    public ApiResponse<ContractorDto> register(@Valid @RequestBody ContractorDto contractorDto) {
        log.info("New contract registration: {}", contractorDto);
        final Contractor contractor = contractorService.register(typeMapper.map(contractorDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractor));
    }

    @Override
    @PostMapping(value = "/create")
    public ApiResponse<ContractorDto> create(ContractorDto contractorDto) {
        log.info("New contract registration: {}", contractorDto);
        final Contractor contractor = contractorService.register(typeMapper.map(contractorDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractor));
    }

    @Override
    public ApiResponse<ContractorDto> update(ContractorDto contractorDto) {
        return null;
    }


    @Override
    public ApiResponse<ContractorDto> delete(ContractorDto contractorDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ContractorDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ContractorDto> find(Long id) {
        return null;
    }
}