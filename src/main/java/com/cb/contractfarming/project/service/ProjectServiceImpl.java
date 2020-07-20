package com.cb.contractfarming.project.service;

import com.cb.contractfarming.project.Project;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation = Propagation.REQUIRED)
public class ProjectServiceImpl implements ProjectService{


  private final ProjectRepository projectRepository;

  @Override
  public Project register(Project project) {
    log.info("New Project Registration"+project);
    return projectRepository.save(project);
  }

  @Override
  public Optional<Project> findById(Long id) {
    return projectRepository.findById(id);
  }

  @Override
  public List<Project> findByProjectName(String projectName) {
    return  projectRepository.findByProjectName(projectName);
  }

  @Override
  public Long total() {
    return projectRepository.count();
  }

  @Override
  public Project update(Project project) {

    log.info("New Project Registration"+project);
    return projectRepository.save(project);
  }

  @Override
  public List<Project> findAll(Pageable pageable) {
   return projectRepository.findAll(pageable).getContent();
  }
}
