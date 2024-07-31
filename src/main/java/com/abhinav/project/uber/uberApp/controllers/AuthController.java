package com.abhinav.project.uber.uberApp.controllers;

import com.abhinav.project.uber.uberApp.dto.SignUpDto;
import com.abhinav.project.uber.uberApp.dto.UserDto;
import com.abhinav.project.uber.uberApp.services.AuthService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto signUp(@RequestBody SignUpDto signUpDto) {
        return authService.signup(signUpDto);
    }


}
