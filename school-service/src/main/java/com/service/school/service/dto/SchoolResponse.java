package com.service.school.service.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse {
    private String name;
    private String email;
    List<StudentDto> students;
}
