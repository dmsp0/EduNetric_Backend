package com.edunetric.controller;

import com.edunetric.dto.UserDto;
import com.edunetric.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        // UserDto를 반환하는 서비스 호출
        return userService.getUserDtoById(id);
    }
}
