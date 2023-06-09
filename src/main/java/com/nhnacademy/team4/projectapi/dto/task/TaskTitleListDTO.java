package com.nhnacademy.team4.projectapi.dto.task;

import com.nhnacademy.team4.projectapi.entity.type.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskTitleListDTO {
    private long taskId;
    private long accountId;
    private String title;
    private String projectName;
    private String status;
}
