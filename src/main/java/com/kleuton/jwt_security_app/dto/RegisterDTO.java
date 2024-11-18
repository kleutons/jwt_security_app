package com.kleuton.jwt_security_app.dto;

import com.kleuton.jwt_security_app.entity.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
