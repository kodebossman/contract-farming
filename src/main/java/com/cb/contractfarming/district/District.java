package com.cb.contractfarming.district;

import com.cb.contractfarming.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "district", indexes = {@Index(name = "id", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class District extends BaseEntity {

  @Column
  private String name;

  @Column
  private int totalWards;

  @ManyToOne
  private Province province;


}