package com.cb.contractfarming.farmer.model.service;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;
@Data
public class SuppliersDto extends BaseDto implements Serializable {
    private String SName;
    private String SAddress;
    private int SPhone;
    private String SEmail;
    private String SCity;

}
