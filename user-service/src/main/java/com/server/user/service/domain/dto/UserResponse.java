package com.server.user.service.domain.dto;

public record UserResponse(
        Integer id,
        String name,
        String email) {
}
