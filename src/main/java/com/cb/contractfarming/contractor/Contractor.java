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

    @Column(name = "contractorName", nullable = false, length = 100)
    private String contractorName;

    @Column(name = "contractorType", nullable = false, length = 20)
    private ContractorType contractorType;

    @Column(name = "contractorPhoneNumber", nullable = false, length = 15, unique = true)
    private String contractorPhoneNumber;

    @Column(name = "contractorPhysicalAddress", nullable = false, length = 150)
    private String contractorPhysicalAddress;

    @Column(name = "contractorEmail", nullable = false, length = 45)
    private String contractorEmail;

    @Column(name = "contractorBankName", nullable = false, length = 50)
    private String contractorBankName;

    @Column(name = "contractBankBranch", nullable = false, length = 50)
    private String contractorBankBranch;

    @Column(name = "contractorBankAccount", nullable = false, length = 15)
    private String contractorBankAccountNumber;


}
