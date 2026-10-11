package com.ganesh.jobportal.dto;

import java.time.LocalDateTime;

public record ContactResponseDto(
        Long id, String name, String email,
        String userType, String subject, String message,
        String status, LocalDateTime createdAt
) {
}