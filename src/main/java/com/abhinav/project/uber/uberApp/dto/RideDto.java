package com.abhinav.project.uber.uberApp.dto;

import com.abhinav.project.uber.uberApp.entities.Driver;
import com.abhinav.project.uber.uberApp.entities.Rider;
import com.abhinav.project.uber.uberApp.entities.enums.PaymentMethod;
import com.abhinav.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {

    private Long id;
    private PointDto pickupLocation;

    private PointDto dropOffLocation;

    private LocalDate CreatedTime;

    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;

    private String otp;
    private Double fair;

    private LocalDateTime StartedAt;

    private LocalDateTime endedAt;
}
