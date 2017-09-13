package com.ihamen;

import com.ihamen.factory.BoatCreator;
import com.ihamen.factory.CarCreator;
import com.ihamen.factory.VehicleCreator;
import com.ihamen.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {


        VehicleCreator[] vehicleCreators = {new CarCreator(),new BoatCreator()};

        for (VehicleCreator vehicleCreator:vehicleCreators){
            Vehicle vehicle = vehicleCreator.createVehicle();
            System.out.println(vehicle);
        }
    }
}
