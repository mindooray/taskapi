package com.nhnacademy.team4.projectapi.dto.project;

import com.nhnacademy.team4.projectapi.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {
    private long projectId;
    private String title;
    private String status;
    private String description;

    public static ProjectDTO projectToProjectDTO(Project project) {
        return new ProjectDTO(project.getProjectId(), project.getTitle(), project.getStatus().toString(), project.getDescription());
    }
}
