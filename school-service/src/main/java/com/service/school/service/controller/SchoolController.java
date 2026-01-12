package com.service.school.service.controller;

import com.service.school.service.dto.SchoolDto;
import com.service.school.service.dto.SchoolResponse;
import com.service.school.service.entity.School;
import com.service.school.service.service.SchoolService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    private final SchoolService service;

    public SchoolController(SchoolService service) {
        this.service = service;
    }

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
