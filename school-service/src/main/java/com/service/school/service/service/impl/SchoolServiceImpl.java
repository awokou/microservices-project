package com.service.school.service.service.impl;

import com.service.school.service.client.StudentClient;
import com.service.school.service.dto.SchoolDto;
import com.service.school.service.dto.SchoolResponse;
import com.service.school.service.dto.StudentDto;
import com.service.school.service.entity.School;
import com.service.school.service.repository.SchoolRepository;
import com.service.school.service.service.SchoolService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public SchoolServiceImpl(SchoolRepository schoolRepository, StudentClient studentClient) {
        this.schoolRepository = schoolRepository;
        this.studentClient = studentClient;
    }

    @Override
    public School saveSchool(SchoolDto school) {

        School newSchool = new School();
        newSchool.setName(school.getName());
        newSchool.setEmail(school.getEmail());

        return schoolRepository.save(newSchool);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SchoolDto> findAllSchools() {
        return schoolRepository.findAll()
                .stream()
                .map(school -> new SchoolDto(school.getId(), school.getName(), school.getEmail()))
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public SchoolResponse findSchoolsWithStudents(Integer schoolId) {
        School school = schoolRepository.findById(schoolId)
                .orElseThrow(() -> new RuntimeException("School not found"));

        List<StudentDto> students = studentClient.findAllStudentsBySchool(schoolId);

        return new SchoolResponse(school.getName(), school.getEmail(), students);
    }
}
