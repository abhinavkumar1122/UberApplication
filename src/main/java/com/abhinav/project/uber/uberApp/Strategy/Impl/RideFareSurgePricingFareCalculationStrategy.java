package com.abhinav.project.uber.uberApp.Strategy.Impl;

import com.abhinav.project.uber.uberApp.Strategy.RideFareCalculationStrategy;
import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {

    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
