package com.java8.refresh.defaultmethodinterfaces;

public class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

}