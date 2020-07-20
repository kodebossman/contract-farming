package com.cb.contractfarming.agromerchants;
import com.cb.contractfarming.common.BaseDto;
import lombok.Data;
import java.io.Serializable;

@Data
public class MerchantDto extends BaseDto implements Serializable {

    private String name;
    private String description;
    private String location;
    private String type;
    private String msisdn;

}
