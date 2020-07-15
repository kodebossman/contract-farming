package com.cb.contractfarming.contract;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contracts", indexes = {@Index(name = "indx_contcts", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contract extends BaseEntity {

  @Column(name = "contract_name", nullable = false, length = 45)
  private String contractName;

  @Column(name = "contract_type", nullable = false, length = 45)
  private ContractType contractType;

  @Column(name = "description", nullable = false, length = 45)
  private String description;

  @Column(name = "date_signed", nullable = false)
  private LocalDateTime dateSigned;

  @Column(name = "contract_end_date", nullable = false)
  private LocalDateTime endDate;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "farmer_id", nullable = false)
  @JsonIgnore
  private Farmer farmer;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "contractor_id", nullable = false)
  @JsonIgnore
  private Contractor contractor;
}
