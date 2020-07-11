package com.cb.contractfarming.project;


import com.cb.contractfarming.common.BaseDto;
import com.cb.contractfarming.contractor.Contractor;
import com.cb.contractfarming.farmer.model.Farmer;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProjectDto extends BaseDto implements Serializable {

  private String projectName;
  private ProjectType projectType;
  private Farmer farmer;
  private Contractor contractor;
  private String description;
  private String duration;

}