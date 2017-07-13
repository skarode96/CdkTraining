package com.company;

/**
 * Created by karodes on 7/13/2017.
 */
public class Car {

    String name;
    int speed;
    boolean status;

    void accelerate() {
        this.speed = speed + 10;
        System.out.println("speed of the car now is increased to : " + speed);
    }
    void brake() {
        this.speed = speed - 10;
        System.out.println("speed of the car now is decreased to : " + speed);
    }
    void start() {
        status = true;
        System.out.println("Car started !");
    }
    void stop() {
        status = false;
        System.out.println("Car stopped");
        this.speed = 0;
    }
}
