package com.cb.contractfarming.items.contract;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ItemsDTO extends BaseDto implements Serializable {

    private String Name;
    private String serialNo;
    private String suppler;
    private String price;
    private String quantity;
    private String desc;

}