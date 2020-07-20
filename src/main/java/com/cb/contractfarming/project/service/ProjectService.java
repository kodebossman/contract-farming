package com.cb.contractfarming.project.service;

import com.cb.contractfarming.project.Project;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface ProjectService {

  Project register(Project project);

  Optional<Project> findById(Long id);

  List<Project> findByProjectName(String projectName);

  Long total();

  Project update(Project project);

  List<Project> findAll(Pageable pageable);
}
