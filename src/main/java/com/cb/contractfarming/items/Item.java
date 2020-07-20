package com.cb.contractfarming.items;


import com.cb.contractfarming.agromerchants.Merchant;
import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.project.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "items", indexes = {@Index(name = "indx_items", columnList = "serial_no", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties
public class Item extends BaseEntity {

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "serial_no", unique = true, nullable = false, length = 45)
  private String serialNo;

  @Column(name = "price", nullable = false, length = 5)
  private Double price;

  @Column(name = "quantity", length = 5)
  private Integer quantity;

  @Column(name = "description", nullable = false, length = 100)
  private String desc;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "mechant_id", nullable = false)
  @JsonIgnore
  private Merchant merchant;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "project_id", nullable = false)
  @JsonIgnore
  private Project project;
}


