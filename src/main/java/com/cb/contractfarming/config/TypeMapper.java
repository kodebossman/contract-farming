package com.cb.contractfarming.config;


import com.cb.contractfarming.farmer.model.Farmer;
import com.cb.contractfarming.farmer.model.FarmerDto;
import com.cb.contractfarming.project.Project;
import com.cb.contractfarming.project.ProjectDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TypeMapper {

  Farmer map(FarmerDto farmerDto);

  FarmerDto map(Farmer farmer);


  Project map(ProjectDto projectDto);
  ProjectDto map(Project project);
}

