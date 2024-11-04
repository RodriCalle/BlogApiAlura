package com.codewithme.blogapi.domain.response.dto;

import java.time.LocalDateTime;

public record CreateResponseDto(
        String message,
        Boolean solution,
        LocalDateTime createdAt,
        Long userId,
        Long topicId) {
}
