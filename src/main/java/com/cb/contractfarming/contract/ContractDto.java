package com.cb.contractfarming.contract;

import com.cb.contractfarming.common.BaseDto;
import com.cb.contractfarming.farmer.model.Farmer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ContractDto extends BaseDto implements Serializable {

    private String contractName;
    private ContractType contractType;
    private String description;
    private LocalDateTime dateSigned;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Farmer farmer;
    private String contractor;

}
