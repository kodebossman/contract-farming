package com.cb.contractfarming.contractor;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

public enum  ContractorType {
    INDV,COMPN,ASSOCIATION
}
