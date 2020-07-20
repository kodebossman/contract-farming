package com.cb.contractfarming.suppliers.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;

import com.cb.contractfarming.suppliers.Suppliers;
import com.cb.contractfarming.suppliers.SuppliersDto;
import com.cb.contractfarming.suppliers.services.SuppliersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/suppliers")
@Slf4j
public class SuppliersAPI implements CrudApi<SuppliersDto> {
    private final SuppliersService suppliersService;
    private final TypeMapper typeMapper;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResponse<SuppliersDto> register(@Valid @RequestBody SuppliersDto suppliersDto){
        log.info("New Registration of Farmer "+suppliersDto);
        final Suppliers suppliers = suppliersService.register(typeMapper.map(suppliersDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(suppliers));

    }

    @Override
    public ApiResponse<SuppliersDto> create(SuppliersDto suppliersDto) {
        return null;
    }

    @Override
    public ApiResponse<SuppliersDto> update(SuppliersDto suppliersDto) {
        return null;
    }

    @Override
    public ApiResponse<SuppliersDto> delete(SuppliersDto suppliersDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<SuppliersDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<SuppliersDto> find(Long id) {
        return null;
    }
}
