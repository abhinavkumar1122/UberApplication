package com.abhinav.project.uber.uberApp.repositories;

import com.abhinav.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
