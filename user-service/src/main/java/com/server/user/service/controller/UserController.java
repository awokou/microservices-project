package com.server.user.service.controller;

import org.springframework.web.bind.annotation.*;

import com.server.user.service.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
}
