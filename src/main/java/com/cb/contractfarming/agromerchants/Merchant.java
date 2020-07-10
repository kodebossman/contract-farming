package com.cb.contractfarming.agromerchants;
import com.cb.contractfarming.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
@Getter
@Setter
@Table(name = "merchant", indexes = {@Index(name = "indx_merchant", columnList = "id", unique = true)} )
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Merchant extends BaseEntity {
    @Column(name="name", nullable = false, length = 45)
    private String name;
  @Column(name="msisdn", nullable = false, length = 45)
  private String msisdn;
  @Column(name ="desription", nullable =false, length =100)
  private String description;
    @Column(name ="location", nullable = false, length = 50)
    private String location;
    @Column(name = "type", nullable = false, length = 45)
    private MerchantType type;


}
