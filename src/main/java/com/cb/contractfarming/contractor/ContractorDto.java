package com.cb.contractfarming.contractor;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ContractorDto extends BaseDto implements Serializable {
    private String contractorName;
    private ContractorType type;
    private String phoneNumber;
    private String physicalAddress;
    private String websiteUrl;
    private String email;
    private String bankName;
    private String bankBranch;
    private String bankAccountNumber;


}
