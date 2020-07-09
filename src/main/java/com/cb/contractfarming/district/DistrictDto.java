package com.cb.contractfarming.district;

import com.cb.contractfarming.common.BaseDto;

import lombok.Data;

import java.io.Serializable;
@Data
public class DistrictDto extends BaseDto implements Serializable {
  private String name;
  private int totalWards;
  private Province province;

}
