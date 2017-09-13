package com.ihamen.factory;

import com.ihamen.vehicle.Car;
import com.ihamen.vehicle.Vehicle;

import java.awt.*;

/**
 * Created by stepanenko.sg on 09.09.2017.
 * Implements concrete class(CarCreator) which created concrete product(Car)
 */
public class CarCreator extends VehicleCreator {
    @Override
    public Vehicle createVehicle() {
        Car car = new Car();
        car.setMark("Mercedes");
        car.setModel("SLK-600");
        car.setNumberOfdoors(2);
        car.setColor(Color.RED);
        return car;
    }
}
