package com.ihamen.vehicle;

import java.awt.*;

/**
 * Created by stepanenko.sg on 09.09.2017.
 * This class implements concrete product(Car)
 */
public class Car implements Vehicle{
    protected String type = "Car";
    protected String mark;
    protected String model;
    protected int numberOfdoors;
    protected Color color;


    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfdoors() {
        return numberOfdoors;
    }

    public void setNumberOfdoors(int numberOfdoors) {
        this.numberOfdoors = numberOfdoors;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Type is %s. Mark is %s. Model is %s. Number of doors is %d. Color is %s",type,mark, model,numberOfdoors,color);
    }
}
