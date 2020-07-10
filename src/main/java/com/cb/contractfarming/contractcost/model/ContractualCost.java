package com.cb.contractfarming.contractcost.model;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.contract.Contract;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contractcost", indexes = {@Index(name = "indx_contcts", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class ContractualCost extends BaseEntity {

  @Column(name = "cost_name", nullable = false, length = 45)
  private String name;
  @Column(name = "cost_type", nullable = false, length = 45)
  private CostType costType;
  @Column(name = "price",nullable = false ,length = 10)
  private  Double totalCost;
  @Column(name = "currency", nullable = false)
  private String currency;
  @Column(name = "charge_Date", nullable = false)
  private LocalDateTime chargeDate;

 @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "contract_id", nullable = false)
  @JsonIgnore
  private Contract contract;
}
