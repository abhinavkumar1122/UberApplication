package com.abhinav.project.uber.uberApp.Strategy.Impl;

import com.abhinav.project.uber.uberApp.Strategy.RideFareCalculationStrategy;
import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import com.abhinav.project.uber.uberApp.entities.RideRequest;
import com.abhinav.project.uber.uberApp.services.DistanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropOffLocation());
        return distance * RIDE_FARE_MULTIPLIER;
    }
}
