package com.service.student.service.domain.mapper;

import com.service.student.service.domain.dto.StudentDto;
import com.service.student.service.domain.entity.Student;

import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public Student toEntity(StudentDto dto) {
        if (dto == null) return null;

        Student student = new Student();
        student.setId(dto.getId());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setSchoolId(dto.getSchoolId());

        return student;
    }

    public StudentDto toDto(Student entity) {
        if (entity == null) return null;

        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setSchoolId(entity.getSchoolId());

        return dto;
    }
}
