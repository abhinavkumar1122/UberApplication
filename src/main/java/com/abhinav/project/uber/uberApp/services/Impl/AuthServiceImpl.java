package com.abhinav.project.uber.uberApp.services.Impl;

import com.abhinav.project.uber.uberApp.dto.DriverDto;
import com.abhinav.project.uber.uberApp.dto.SignUpDto;
import com.abhinav.project.uber.uberApp.dto.UserDto;
import com.abhinav.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
