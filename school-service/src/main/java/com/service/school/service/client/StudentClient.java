package com.service.school.service.client;

import com.service.school.service.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${students.service.url}")
public interface StudentClient {

    @GetMapping("/school/{schoolId}")
    List<StudentDto> findAllStudentsBySchool(@PathVariable("schoolId") Integer schoolId);
}
