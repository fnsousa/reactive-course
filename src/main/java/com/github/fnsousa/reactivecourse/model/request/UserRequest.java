package com.github.fnsousa.reactivecourse.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
