package com.cb.contractfarming.contractor;
import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "contractor", indexes = {@Index(name = "indx_contractor", columnList = "contractorPhoneNumber", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contractor extends BaseEntity {

    @Column(name = "contractorId", nullable = false, length = 20)
    private String contractorId;

    @Column(name = "contractorName", nullable = false, length = 100)
    private String name;

    @Column(name = "contractorType", nullable = false, length = 20)
    private ContractorType type;

    @Column(name = "contractorPhoneNumber", nullable = false, length = 15, unique = true)
    private String phoneNumber;

    @Column(name = "contractorPhysicalAddress", nullable = false, length = 150)
    private String physicalAddress;

    @Column(name = "contractorEmail", nullable = false, length = 45)
    private String email;

    @Column(name = "contractorBankName", nullable = false, length = 50)
    private String bankName;

    @Column(name = "contractBankBranch", nullable = false, length = 50)
    private String bankBranch;

    @Column(name = "contractorBankAccount", nullable = false, length = 15)
    private String bankAccountNumber;


}
