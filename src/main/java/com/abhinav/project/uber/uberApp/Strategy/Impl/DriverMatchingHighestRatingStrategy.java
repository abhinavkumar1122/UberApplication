package com.abhinav.project.uber.uberApp.Strategy.Impl;

import com.abhinav.project.uber.uberApp.Strategy.DriverMatchingStrategy;
import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import com.abhinav.project.uber.uberApp.entities.Driver;
import com.abhinav.project.uber.uberApp.entities.RideRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatingStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return List.of();
    }
}
