package com.cb.contractfarming.contract;

import com.cb.contractfarming.common.BaseDto;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ContractDto extends BaseDto implements Serializable {

    private String contractName;
    private ContractType contractType;
    private String description;
    private LocalDate dateSigned;
    private LocalDate startDate;
    private LocalDate endDate;
    private Farmer farmer;
    private Contractor contractor;

}
