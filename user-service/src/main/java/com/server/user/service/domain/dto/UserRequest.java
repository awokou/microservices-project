package com.server.user.service.domain.dto;

public record UserRequest(
        Integer id,
        String name,
        String email,
        String password) {
}