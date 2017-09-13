package com.ihamen.vehicle;

/**
 * Created by stepanenko.sg on 09.09.2017.
 * This class implements concrete product(Boat)
 */
public class Boat implements Vehicle{
    protected String type = "Boat";
    protected String name;
    protected int enginePower;

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return String.format("Type is %s. Name is %s. Power of engine is %d " ,type,name,enginePower);
    }
}
