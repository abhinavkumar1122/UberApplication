package com.abhinav.project.uber.uberApp.services;

import com.abhinav.project.uber.uberApp.dto.DriverDto;
import com.abhinav.project.uber.uberApp.dto.SignUpDto;
import com.abhinav.project.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);

    UserDto signup(SignUpDto signUpDto);

    DriverDto onboardNewDriver(Long userId);


}
