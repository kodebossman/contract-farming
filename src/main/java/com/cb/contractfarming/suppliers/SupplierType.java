package com.cb.contractfarming.suppliers;

  import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;

  import javax.persistence.*;

public enum SupplierType{
    INDV,COMPN,ASSOCIATION
}
