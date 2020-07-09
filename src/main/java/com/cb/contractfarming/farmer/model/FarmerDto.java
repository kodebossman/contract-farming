package com.cb.contractfarming.farmer.model;

import com.cb.contractfarming.common.BaseDto;
import com.cb.contractfarming.district.District;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;


@Data
public class FarmerDto extends BaseDto implements Serializable {

  private String firstName;
  private String lastName;
  private String idNumber;
  private String msisdn;
  private String latitude;
  private String longitude;
  private District district;
  private String village;

}
