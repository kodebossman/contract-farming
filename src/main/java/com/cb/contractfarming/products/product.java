package com.cb.contractfarming.products;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Index;
import javax.persistence.Table;

import javax.persistence.*;
@Table(name = "contract_product", indexes = {@Index(name = "indx_items",columnList ="product_id", unique = true)})
public class product extends BaseEntity {
    @Getter
    @Setter
    @Entity
    @Access(AccessType.FIELD)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    @Column(name = "product_name", length= 50, nullable = false)
    private String product_name;
    @Column(name = "product_id", length= 50, unique= true, nullable = false)
    private String product_id;
    @Column(name = "product_type", length= 50, nullable = false)
    private String product_type;
    @Column(name = "product_price", length= 50, nullable = false)
    private double product_price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;




}
