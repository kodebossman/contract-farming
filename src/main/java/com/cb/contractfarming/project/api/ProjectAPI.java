package com.cb.contractfarming.project.api;


import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.exception.BusinessException;
import com.cb.contractfarming.project.Project;
import com.cb.contractfarming.project.ProjectDto;
import com.cb.contractfarming.project.service.ProjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/project")
public class ProjectAPI implements CrudApi<ProjectDto> {


  private ProjectService projectService;
  private TypeMapper typeMapper;

  @PostMapping(name = "/register")
  public ApiResponse<ProjectDto> register(@Valid @RequestBody ProjectDto projectDto){

    log.info("New Registration for the new Project"+projectDto);
    final Project project= projectService.register(typeMapper.map(projectDto));
    return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(project));
  }

  @GetMapping(name ="/find/{name}")
  public ApiResponse<PaginationResult<ProjectDto> > findByNAme(@PathVariable(name = "name") String projectName){
    List<ProjectDto> projectDtos =  projectService.findByProjectName(projectName)
      .stream()
      .map(typeMapper::map)
      .collect(Collectors.toList());

    PaginationResult<ProjectDto> pagedProjects = PaginationResult.pagination(projectDtos, projectService.total(), 1 , projectDtos.size()-1);

      return new ApiResponse<>(HttpStatus.OK.value(), pagedProjects);
    }



  @Override
  public ApiResponse<ProjectDto> create(ProjectDto projectDto) {
    log.info("New Registration for the new Project"+projectDto);
    final Project project= projectService.register(typeMapper.map(projectDto));
    return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(project));
  }

  @Override
  public ApiResponse<ProjectDto> update(ProjectDto projectDto) {
    log.info("New Registration for the new Project"+projectDto);
    final Project project= projectService.register(typeMapper.map(projectDto));
    return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(project));
  }

  @Override
  public ApiResponse<ProjectDto> delete(ProjectDto projectDto) {
    return null;
  }

  @Override
  public ApiResponse<PaginationResult<ProjectDto>> findAll(String search, Integer page, Integer size, String sortBy) {

    List<ProjectDto> projectDtos = projectService.findAll(PageRequest.of(page-1,size, Sort.by(sortBy)))
      .stream()
      .map(typeMapper::map)
      .collect(Collectors.toList());

    PaginationResult<ProjectDto> pagedProjects = PaginationResult.pagination(projectDtos, projectService.total(), page, size);
    return new ApiResponse<>(HttpStatus.OK.value(), pagedProjects);
  }

  @Override
  public ApiResponse<ProjectDto> find(Long id) {
    Optional<Project> project= projectService.findById(id);
    return project.map(project1 -> new ApiResponse<>(HttpStatus.OK.value(),typeMapper.map(project1)))
      .orElseThrow(()->new BusinessException("Project with id "+id+ "not found"));
  }
}
