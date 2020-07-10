package com.cb.contractfarming.items;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ItemsDTO extends BaseDto implements Serializable {

    private String name;
    private String serialNo;
    private String suppler;
    private Double price;
    private Double quantity;
    private String desc;

}