package com.abhinav.project.uber.uberApp.Strategy;

import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import com.abhinav.project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
