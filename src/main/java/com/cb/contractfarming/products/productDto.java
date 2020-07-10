package com.cb.contractfarming.products;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;
@Data
public class productDto extends BaseDto implements Serializable {
    private String name product_name;
    private String name product_id;
    private String name product_type;
    private String name product_price;

}
