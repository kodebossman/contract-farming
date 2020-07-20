package com.cb.contractfarming.suppliers;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;
@Data
public class SuppliersDto extends BaseDto implements Serializable {
    private String supplierName;
    private String supplierAddress;
    private int supplierPhone;
    private String supplierEmail;
    private String supplierCity;
    private SupplierType supplierType;

}
