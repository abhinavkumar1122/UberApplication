package com.abhinav.project.uber.uberApp.Strategy;

import com.abhinav.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
