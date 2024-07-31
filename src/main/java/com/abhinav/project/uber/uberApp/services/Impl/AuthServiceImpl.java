package com.abhinav.project.uber.uberApp.services.Impl;

import com.abhinav.project.uber.uberApp.dto.DriverDto;
import com.abhinav.project.uber.uberApp.dto.SignUpDto;
import com.abhinav.project.uber.uberApp.dto.UserDto;
import com.abhinav.project.uber.uberApp.entities.User;
import com.abhinav.project.uber.uberApp.entities.enums.Role;
import com.abhinav.project.uber.uberApp.exceptions.RunTimeConflictException;
import com.abhinav.project.uber.uberApp.repositories.UserRepository;
import com.abhinav.project.uber.uberApp.services.AuthService;
import com.abhinav.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignUpDto signUpDto) {
        User user = userRepository.findByEmail(signUpDto.getEmail()).orElse(null);
        if(user != null) {
             throw new RunTimeConflictException("Cannot sign up because user already exists" + signUpDto.getEmail());
        }
        User mappedUser = modelMapper.map(signUpDto, User.class);
        // default role is assigned to RIDER
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

        // create user related entities
        riderService.createNewRider(savedUser);
        // TODO add wallet related service here


        return modelMapper.map(savedUser, UserDto.class);


    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
