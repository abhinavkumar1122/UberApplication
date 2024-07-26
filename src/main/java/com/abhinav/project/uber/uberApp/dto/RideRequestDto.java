package com.abhinav.project.uber.uberApp.dto;

import com.abhinav.project.uber.uberApp.entities.enums.PaymentMethod;
import com.abhinav.project.uber.uberApp.entities.enums.RideRequestStatus;
import com.abhinav.project.uber.uberApp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RideRequestDto {

    private Long id;
    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;
    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}
