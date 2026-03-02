package com.service.school.service.service;

import com.service.school.service.domain.dto.SchoolDto;
import com.service.school.service.domain.dto.SchoolResponse;
import com.service.school.service.domain.entity.School;

import java.util.List;

public interface SchoolService {
    School saveSchool(SchoolDto school);
    List<SchoolDto> findAllSchools();
    SchoolResponse findSchoolsWithStudents(Integer schoolId);
}
