package com.ganesh.jobportal.dto;

public record JobApplicationDto(
        Long id,
        Long userId,
        String userName,
        String userEmail,
        String userMobileNumber,
        ProfileDto userProfile,
        JobDto job,
        java.time.@jakarta.validation.constraints.NotNull Instant appliedAt,
        String status,
        String coverLetter,
        String notes
) {
}