package com.cb.contractfarming.contractcost.model;

import com.cb.contractfarming.common.BaseDto;
import com.cb.contractfarming.contract.Contract;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
public class CostDto extends BaseDto implements Serializable {

  private String name;
  private CostType costType;
  private  Double totalCost;
  private String currency;
  private LocalDateTime chargeDate;
  private Contract contract;
}
