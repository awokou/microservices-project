package com.service.school.service.service;

import com.service.school.service.dto.SchoolDto;
import com.service.school.service.dto.SchoolResponse;
import com.service.school.service.entity.School;

import java.util.List;

public interface SchoolService {
    School saveSchool(SchoolDto school);
    List<SchoolDto> findAllSchools();
    SchoolResponse findSchoolsWithStudents(Integer schoolId);
}
