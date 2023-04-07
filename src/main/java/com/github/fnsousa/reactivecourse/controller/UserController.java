package com.github.fnsousa.reactivecourse.controller;

import com.github.fnsousa.reactivecourse.model.request.UserRequest;
import com.github.fnsousa.reactivecourse.model.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

public interface UserController {

    @PostMapping
    ResponseEntity<Mono<Void>> save(@RequestBody UserRequest request);

    @GetMapping("{id}")
    ResponseEntity<Mono<UserResponse>> find(@PathVariable String id);

    @GetMapping
    ResponseEntity<Mono<UserResponse>> findAll();

    @PatchMapping("{id}")
    ResponseEntity<Mono<UserResponse>> update(@PathVariable String id, @RequestBody UserRequest request);

    @DeleteMapping("{id}")
    ResponseEntity<Mono<Void>> delete(@PathVariable String id);

}
