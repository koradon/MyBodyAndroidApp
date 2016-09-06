package com.example.michal.mybodyandroidapp.model;

/**
 * Created by Michał on 05.09.2016.
 */
public class Body {
    private double height;
    private double weight;

    public Body(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Body{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
