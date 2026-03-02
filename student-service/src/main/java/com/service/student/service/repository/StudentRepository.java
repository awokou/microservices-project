package com.service.student.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.student.service.domain.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
