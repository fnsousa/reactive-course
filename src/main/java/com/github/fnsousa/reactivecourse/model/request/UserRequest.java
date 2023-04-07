package com.github.fnsousa.reactivecourse.model.request;

public record UserRequest(
        String nome,
        String email,
        String password
) {
}
