package com.abhinav.project.uber.uberApp.Strategy;

import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import com.abhinav.project.uber.uberApp.entities.Driver;
import com.abhinav.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
