package com.abhinav.project.uber.uberApp.Strategy.Impl;

import com.abhinav.project.uber.uberApp.Strategy.DriverMatchingStrategy;
import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import com.abhinav.project.uber.uberApp.entities.Driver;
import com.abhinav.project.uber.uberApp.entities.RideRequest;
import com.abhinav.project.uber.uberApp.repositories.DriverRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickUpLocation());
    }
}
