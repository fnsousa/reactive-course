package com.github.fnsousa.reactivecourse.service;

import com.github.fnsousa.reactivecourse.entity.User;
import com.github.fnsousa.reactivecourse.mapper.UserMapper;
import com.github.fnsousa.reactivecourse.model.request.UserRequest;
import com.github.fnsousa.reactivecourse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public Mono<User> save(UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }

}
