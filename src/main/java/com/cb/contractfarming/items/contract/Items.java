package com.cb.contractfarming.items.contract;



import com.cb.contractfarming.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


    @Entity
    @Table(name = "items", indexes = {@Index(name = "indx_items",columnList = "serialNO", unique = true)})
    @Getter
    @Setter
    @ToString
    @Access(AccessType.FIELD)
    @JsonIgnoreProperties
    public class Items extends BaseEntity {

        @Column(name="name", nullable = false, length = 50)
        private String Name;

        @Column(name="seriaNO", unique = true, nullable = false, length = 45)
        private String serialNo;

        @Column(name = "supplier", nullable = false, length = 20)
        private String suppler;

        @Column(name="price", nullable = false, length = 5)
        private String price;

        @Column(name="quantity", length = 5)
        private String quantity;

        @Column(name="desc", nullable = false, length = 100)
        private String desc;




}
