package com.cb.contractfarming.products;

import com.cb.contractfarming.common.BaseDto;
import com.cb.contractfarming.farmer.model.Farmer;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Data
public class ProductDto extends BaseDto implements Serializable {

  private String productName;
  private  String productDesc;
  private String productType;
  private Double productPrice;
  private Farmer farmer;

}
