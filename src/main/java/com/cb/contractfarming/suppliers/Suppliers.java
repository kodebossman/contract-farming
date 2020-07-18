package com.cb.contractfarming.suppliers;

import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Access(AccessType.FIELD)
@Table(name = "suppliers", indexes = {@Index(name = "indx_suppliers",columnList ="id", unique = true)})
public class Suppliers extends BaseEntity {

    @Column(name="supplier_name", nullable = false, length = 45)
    private String supplierName;
    @Column(name="supplier_type",nullable= false,length= 12)
    private SupplierType supplierType;
    @Column(name="supplier_address", nullable = false, length = 70)
    private String supplierAddress;
    @Column(name="supplier_phone", nullable = false, length = 45)
    private int supplierPhone;
    @Column(name="supplier_email", nullable = false, length = 45)
    private String supplierEmail;
    @Column(name="supplier_city", nullable = false, length = 45)
    private String supplierCity;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Farmer farmer;


}
