package com.service.student.service.mapper;

import com.service.student.service.dto.StudentDto;
import com.service.student.service.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public Student toEntity(StudentDto dto) {
        if (dto == null) return null;

        Student student = new Student();
        student.setId(dto.getId());
        student.setFirstname(dto.getFirstname());
        student.setLastname(dto.getLastname());
        student.setEmail(dto.getEmail());
        student.setSchoolId(dto.getSchoolId());

        return student;
    }

    public StudentDto toDto(Student entity) {
        if (entity == null) return null;

        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setFirstname(entity.getFirstname());
        dto.setLastname(entity.getLastname());
        dto.setEmail(entity.getEmail());
        dto.setSchoolId(entity.getSchoolId());

        return dto;
    }
}
