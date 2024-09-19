package com.clinica.auth_service.payload;

public record LoginRequest(String email, String password) {
}