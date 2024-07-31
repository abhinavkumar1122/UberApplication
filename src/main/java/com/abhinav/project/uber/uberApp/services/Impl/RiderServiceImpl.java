package com.abhinav.project.uber.uberApp.services.Impl;

import com.abhinav.project.uber.uberApp.Strategy.DriverMatchingStrategy;
import com.abhinav.project.uber.uberApp.Strategy.RideFareCalculationStrategy;
import com.abhinav.project.uber.uberApp.dto.DriverDto;
import com.abhinav.project.uber.uberApp.dto.RideDto;
import com.abhinav.project.uber.uberApp.dto.RideRequestDto;
import com.abhinav.project.uber.uberApp.dto.RiderDto;
import com.abhinav.project.uber.uberApp.entities.RideRequest;
import com.abhinav.project.uber.uberApp.entities.Rider;
import com.abhinav.project.uber.uberApp.entities.User;
import com.abhinav.project.uber.uberApp.entities.enums.RideRequestStatus;
import com.abhinav.project.uber.uberApp.repositories.RideRequestRepository;
import com.abhinav.project.uber.uberApp.repositories.RiderRepository;
import com.abhinav.project.uber.uberApp.services.RiderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;

    @Qualifier("riderFareDefaultFareCalculationStrategy")
    private final RideFareCalculationStrategy rideFareCalculationStrategy;

    @Qualifier("driverMatchingNearestDriverStrategy")
    private final DriverMatchingStrategy driverMatchingStrategy;

    private final RideRequestRepository rideRequestRepository;

    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);
        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        driverMatchingStrategy.findMatchingDrivers(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider
                .builder()
                .user(user)
                .rating(0.0)
                .build();

        return riderRepository.save(rider);

    }
}
