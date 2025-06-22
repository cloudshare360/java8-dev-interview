package com.java8.refresh;
//import com.java8.refresh.defaultInterface.*;

import com.java8.refresh.defaultmethodinterfaces.Car;

/**
 * Hello world!
 */
public final class App {

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle(); // Default Interface
    }

}
