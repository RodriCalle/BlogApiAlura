package com.codewithme.blogapi.domain.topic.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateTopicDto(
        @NotBlank
        String title,
        @NotBlank
        String message
) {
}
