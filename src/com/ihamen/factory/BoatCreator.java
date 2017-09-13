package com.ihamen.factory;

import com.ihamen.vehicle.Boat;
import com.ihamen.vehicle.Vehicle;

/**
 * Created by stepanenko.sg on 09.09.2017.
 * Implements concrete class(BoatCreator) which created concrete product(Boat)
 */
public class BoatCreator extends VehicleCreator {
    @Override
    public Vehicle createVehicle() {
        Boat boat = new Boat();
        boat.setName("Blue Thunder");
        boat.setEnginePower(500);
        return boat;
    }
}
