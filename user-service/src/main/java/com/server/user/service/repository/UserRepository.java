package com.server.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.user.service.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}