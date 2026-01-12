package com.service.student.service.service;

import com.service.student.service.dto.StudentDto;
import com.service.student.service.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(StudentDto student);

    StudentDto saveStudentV2(StudentDto studentDto);

    List<StudentDto> findAllStudents();

    List<StudentDto> findAllStudentsBySchool(Integer schoolId);

    void deleteStudent(Integer id);
}
