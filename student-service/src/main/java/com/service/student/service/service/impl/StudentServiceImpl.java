package com.service.student.service.service.impl;

import com.service.student.service.domain.dto.StudentDto;
import com.service.student.service.domain.entity.Student;
import com.service.student.service.domain.mapper.StudentMapper;
import com.service.student.service.repository.StudentRepository;
import com.service.student.service.service.StudentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public Student saveStudent(StudentDto student) {
        log.info("Demarrager");
        Student studentEntity = new Student();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setSchoolId(student.getSchoolId());

        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentDto saveStudentV2(StudentDto studentDto) {
        Student student = studentMapper.toEntity(studentDto);
        Student saved = studentRepository.save(student);
        return studentMapper.toDto(saved);
    }

    @Override
    public List<StudentDto> findAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toDto)
                .toList();
    }

    @Override
    public List<StudentDto> findAllStudentsBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId)
                .stream()
                .map(studentMapper::toDto)
                .toList();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
