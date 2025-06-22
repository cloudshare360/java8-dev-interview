package com.java8.refresh.defaultmethodinterfaces;
public interface Vehicle {

    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}