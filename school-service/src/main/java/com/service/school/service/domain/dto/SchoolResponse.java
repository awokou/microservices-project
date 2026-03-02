package com.service.school.service.domain.dto;

import lombok.*;

import java.util.List;

import com.server.common.lib.dto.StudentDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse {
    private String name;
    private String email;
    List<StudentDto> students;
}
