package com.cb.contractfarming.agromerchants.api;
import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.agromerchants.MerchantDto;
import com.cb.contractfarming.agromerchants.service.MerchantService;
import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/merchant")

public class MerchantApi implements CrudApi<MerchantDto> {
    private final MerchantService merchantService;
    private final TypeMapper typeMapper;

    //Register A New Merchant
    @PostMapping(value = "/register")
    public ApiResponse<MerchantDto> register( @Valid @RequestBody MerchantDto merchantDto){
        log.info("New Merchant "+ merchantDto);
        final Merchant merchant = merchantService.register(typeMapper.map(merchantDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(merchant));
    }

    @Override
    public ApiResponse<MerchantDto> create(MerchantDto merchantDto) {
        return null;
    }

    @Override
    public ApiResponse<MerchantDto> update(MerchantDto merchantDto) {
        return null;
    }

    @Override
    public ApiResponse<MerchantDto> delete(MerchantDto merchantDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<MerchantDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<MerchantDto> find(Long id) {
        return null;
    }
}
