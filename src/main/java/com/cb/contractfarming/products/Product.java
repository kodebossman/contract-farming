package com.cb.contractfarming.products;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Entity
@Table(name = "products", indexes = {@Index(name = "indx_product",columnList ="id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties

public class Product extends BaseEntity {

    @Column(name = "product_name", length= 50, nullable = false)
    private String productNname;
    @Column(name = "product_desc", length= 50, unique= true, nullable = false)
    private  String productDesc;
    @Column(name = "product_type", length= 50, unique= true, nullable = false)
    private String productType;
    @Column(name = "product_price", length= 50, nullable = false)
    private Double productPrice;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;

}
