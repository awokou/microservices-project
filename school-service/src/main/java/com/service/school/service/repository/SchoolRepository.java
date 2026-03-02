package com.service.school.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.school.service.domain.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

    boolean existsByName(String name);

    boolean existsByEmail(String email);
}
