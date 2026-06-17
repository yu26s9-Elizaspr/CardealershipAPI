package com.dealership_api.Service;

import com.dealership_api.Models.Vehicle;
import com.dealership_api.Repositories.VehicleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleByVin(int vin) {
        return vehicleRepository.findById(vin).orElse(null);
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }


    public Vehicle updateVehicle(int vin, Vehicle updatedVehicle) {
        Vehicle vehicle = vehicleRepository.findById(vin).orElse(null);

        if (vehicle == null) {
            return null;
        }

        vehicle.setYear(updatedVehicle.getYear());
        vehicle.setMake(updatedVehicle.getMake());
        vehicle.setModel(updatedVehicle.getModel());
        vehicle.setVehicleType(updatedVehicle.getVehicleType());
        vehicle.setColor(updatedVehicle.getVehicleType());
        vehicle.setColor(updatedVehicle.getColor());
        vehicle.setOdometer(updatedVehicle.getOdometer());
        vehicle.setPrice(updatedVehicle.getPrice());

        return vehicleRepository.save(vehicle);

    }

    public void deleteVehicle(int vin) {
        vehicleRepository.deleteById(vin);
    }
}
