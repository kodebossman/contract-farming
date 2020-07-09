package com.cb.contractfarming.district;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class ProvinceDto extends BaseDto implements Serializable {
  private String name;
}
