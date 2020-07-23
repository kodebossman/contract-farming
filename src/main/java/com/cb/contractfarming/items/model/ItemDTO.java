package com.cb.contractfarming.items.model;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ItemDTO extends BaseDto implements Serializable {

    private String name;
    private String serialNo;
    private String suppler;
    private Double price;
    private Double quantity;
    private String description;

}
