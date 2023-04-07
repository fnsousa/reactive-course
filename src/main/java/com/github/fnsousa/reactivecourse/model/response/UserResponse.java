package com.github.fnsousa.reactivecourse.model.response;

public record UserResponse(
        String id,
        String nome,
        String email,
        String password
) {
}
