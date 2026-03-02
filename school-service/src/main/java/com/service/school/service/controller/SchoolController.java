package com.service.school.service.controller;

import com.service.school.service.domain.dto.SchoolDto;
import com.service.school.service.domain.dto.SchoolResponse;
import com.service.school.service.domain.entity.School;
import com.service.school.service.service.SchoolService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/schools")
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    public ResponseEntity<School> save(@Valid @RequestBody SchoolDto school) {

        return ResponseEntity.ok(service.saveSchool(school));
    }

    @GetMapping
    public ResponseEntity<List<SchoolDto>> findAllSchools() {
        return ResponseEntity.ok(service.findAllSchools());
    }

    @GetMapping("/{schoolId}")
    public ResponseEntity<SchoolResponse> findAllSchools(@PathVariable("schoolId") Integer schoolId) {
        return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId));
    }
}
