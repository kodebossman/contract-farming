package com.cb.contractfarming.contractor;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ContractorDto extends BaseDto implements Serializable {
    private String contractorName;
    private ContractorType contractorType;
    private String contractorPhoneNumber;
    private String contractorPhysicalAddress;
    private String contractorEmail;
    private String contractorBankName;
    private String contractorBankBranch;
    private String contractorBankAccountNumber;


}
