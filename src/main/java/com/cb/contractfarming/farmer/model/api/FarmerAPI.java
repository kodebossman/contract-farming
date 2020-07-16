package com.cb.contractfarming.farmer.model.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.farmer.model.service.FarmerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/farmer")

public class FarmerAPI implements CrudApi<FarmerDto> {

  private final FarmerService farmerService;
 private  final TypeMapper typeMapper;

  @RequestMapping(value = "/register", method = RequestMethod.POST)
 public ApiResponse<FarmerDto> register( @Valid @RequestBody FarmerDto farmerDto){
   log.info("New Registration of Farmer "+farmerDto);
   final Farmer farmer = farmerService.register(typeMapper.map(farmerDto));
   return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(farmer));
 }

  @Override
  public ApiResponse<FarmerDto> create(FarmerDto farmerDto) {
    return null;
  }

  @Override
  public ApiResponse<FarmerDto> update(FarmerDto farmerDto) {
    return null;
  }

  @Override
  public ApiResponse<FarmerDto> delete(FarmerDto farmerDto) {
    return null;
  }

  @Override
  public ApiResponse<PaginationResult<FarmerDto>> findAll(String search, Integer page, Integer size, String sortBy) {
    return null;
  }

  @Override
  public ApiResponse<FarmerDto> find(Long id) {
    return null;
  }
}
