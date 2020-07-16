package com.cb.contractfarming.disbursment.model;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.items.Item;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dusbursements", indexes = {@Index(name = "index_disbursment", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Disbursment extends BaseEntity {

  @Column(name = "disbursment_code", nullable = false, length = 100)
  private String code;
  @Column(name = "disbursment_date", nullable = false)
  private LocalDateTime disbursmentDate;
  @Column(name = "dusburment_msisdn", nullable = false, length = 100)
  private String msisdn;
  @Column(name = "dusbursent_type", nullable = false, length = 100)
  private DisbursmentType disbursmentType;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "farmer_id", nullable = false)
  @JsonIgnore
  private Farmer farmer;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "contractor_id", nullable = false)
  @JsonIgnore
  private Contractor contractor;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "item_id", nullable = false)
  @JsonIgnore
  private Item item;

}
