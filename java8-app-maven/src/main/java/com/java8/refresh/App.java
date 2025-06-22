package com.java8.refresh;
//import com.java8.refresh.defaultInterface.*;

import com.java8.refresh.defaultmethodinterfaces.Car;
import com.java8.refresh.defaultmethodinterfaces.InterfaceA;
import com.java8.refresh.defaultmethodinterfaces.InterfaceB;

/**
 * Hello world!
 */
public class App implements InterfaceA, InterfaceB {

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
        App app = new App();
        app.printSomething(); // resolving dimond problem
    }

    @Override
    public void printSomething() {
        // TODO Auto-generated method stub
        // Option 1 -> Provide our own implementation.
        System.out.println("I am inside Main class");

        // Option 2 -> Use existing implementation from interfaceA or interfaceB or
        // both.
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

}
