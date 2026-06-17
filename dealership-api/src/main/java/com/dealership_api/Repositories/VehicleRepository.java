package com.dealership_api.Repositories;
import com.dealership_api.Models.Vehicle;


import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}