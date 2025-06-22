package com.java8.refresh.defaultmethodinterfaces;
public interface InterfaceB {

    default void printSomething() {
        System.out.println("I am inside B interface");
    }

}
