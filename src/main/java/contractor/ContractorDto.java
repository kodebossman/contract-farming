package contractor;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ContractorDto {
    private String name;
    private ContractorType type;
    private String phoneNumber;
    private String physicalAddress;
    private String websiteUrl;
    private String email;
    private String bankName;
    private String bankBranch;
    private String bankAccountNumber;


}
