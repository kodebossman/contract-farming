package com.cb.contractfarming.contractor.api;
import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.contractor.ContractorDto;
import com.cb.contractfarming.contractor.service.ContractorService;
import com.cb.contractfarming.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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

    @GetMapping(value = "/find/{contractorId}")
    public ApiResponse<ContractorDto> findContractor(@PathVariable(name = "contractorId") final String contractorId) {
        final Optional<Contractor> contractor = contractorService.findByContractorId(contractorId);
        return contractor.map(contractor1 -> new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(contractor1)))
                .orElseThrow(() -> new BusinessException("Contractor with msisdn " + contractorId + "not found"));
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
        log.info("Contractor Update "+ contractorDto.getName());
        final Contractor contractor = contractorService.register(typeMapper.map(contractorDto));
        return new ApiResponse<>(HttpStatus.OK.value(),typeMapper.map(contractor));
    }

    @Override
    public ApiResponse<ContractorDto> delete(ContractorDto contractorDto) {
        return null;
    }

    @DeleteMapping(value = "delete/{contractorId}")
    public void deleteContractor(@PathVariable(name = "contractorId") Long contractorId) {
        contractorService.deleteContractor(contractorId);
    }

    @Override
    public ApiResponse<PaginationResult<ContractorDto>> findAll(String search, Integer page, Integer size, String sortBy) {
            log.info("Finding all the Contractors");
            List<ContractorDto> contractorDto = contractorService.findAll(PageRequest.of(page - 1, size, Sort.by(sortBy)))
                    .stream()
                    .map(typeMapper::map)
                    .collect(Collectors.toList());

            PaginationResult<ContractorDto> paginationResult = PaginationResult.pagination(contractorDto, contractorService.total(), page, size);
            return new ApiResponse<>(HttpStatus.OK.value(), paginationResult);
    }

    @Override
    public ApiResponse<ContractorDto> find(Long id) {
        final Optional<Contractor> contractor = contractorService.findById(id);
        return contractor.map(contractor1 -> new ApiResponse<>(HttpStatus.OK.value(),typeMapper.map(contractor1)))
                .orElseThrow(()-> new BusinessException("Not found"));
    }

}
