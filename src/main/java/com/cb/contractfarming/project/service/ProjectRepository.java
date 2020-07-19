package com.cb.contractfarming.project.service;

import com.cb.contractfarming.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project,Long> {
Optional<Project>findById(Long Id);
List<Project> findByProjectName(String projectName);

}
