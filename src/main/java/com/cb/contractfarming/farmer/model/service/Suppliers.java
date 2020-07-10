package com.cb.contractfarming.farmer.model.service;

import com.cb.contractfarming.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Table(name = "suppliers")
public class Suppliers extends BaseEntity {
    @Column(name="supplier_name", nullable = false, length = 45)
    private String SName;
    @Column(name="supplier_address", nullable = false, length = 70)
    private String SAddress;
    @Column(name="supplier_phone", nullable = false, length = 45)
    private int SPhone;
    @Column(name="supplier_email", nullable = false, length = 45)
    private String SEmail;
    @Column(name="supplier_city", nullable = false, length = 45)
    private String SCity;

}
