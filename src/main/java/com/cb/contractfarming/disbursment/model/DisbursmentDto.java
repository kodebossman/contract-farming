package com.cb.contractfarming.disbursment.model;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.items.Item;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
public class DisbursmentDto extends BaseEntity implements Serializable {
  private String code;
  private LocalDateTime disbursmentDate;
  private String msisdn;
  private DisbursmentType disbursmentType;
  private Farmer farmer;
  private Contractor contractor;
  private Item item;

}
