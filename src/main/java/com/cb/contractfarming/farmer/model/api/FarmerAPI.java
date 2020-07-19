package com.cb.contractfarming.farmer.model.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.exception.BusinessException;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.farmer.model.service.FarmerService;
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
    log.info("New Farmer Registration");
    final Farmer farmer =farmerService.register(typeMapper.map(farmerDto));
    return new ApiResponse<>(HttpStatus.OK.value(),typeMapper.map(farmer));
  }

  @Override
  public ApiResponse<FarmerDto> update(FarmerDto farmerDto) {

    log.info("New Farmer Registration");
    final Farmer farmer =farmerService.register(typeMapper.map(farmerDto));
    return new ApiResponse<>(HttpStatus.OK.value(),typeMapper.map(farmer));
  }

  @Override
  public ApiResponse<FarmerDto> delete(FarmerDto farmerDto) {
    return null;
  }

  @Override
  public ApiResponse<PaginationResult<FarmerDto>> findAll(String search, Integer page, Integer size, String sortBy) {
    log.info("Finding all the the farmers");
    List<FarmerDto> farmerDtos = farmerService.findAll(PageRequest.of(page - 1, size, Sort.by(sortBy)))
      .stream()
      .map(typeMapper::map)
      .collect(Collectors.toList());

    PaginationResult<FarmerDto> pagedFarmer = PaginationResult.pagination(farmerDtos, farmerService.total(), page, size);
    return new ApiResponse<>(HttpStatus.OK.value(), pagedFarmer);
  }

  @Override
  public ApiResponse<FarmerDto> find(Long id) {
    final Optional<Farmer> farmer = farmerService.findById(id);
    return farmer.map(farmer1 -> new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(farmer1)))
      .orElseThrow(() -> new BusinessException("Farmer with Id " + id + "not found"));
  }
}
