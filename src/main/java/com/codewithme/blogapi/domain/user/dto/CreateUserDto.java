package com.codewithme.blogapi.domain.user.dto;

import com.codewithme.blogapi.domain.user.User;

public record UserDto(String username, String email) {
    public UserDto(User user) {
        this (user.getUsername(), user.getEmail());
    }
}
