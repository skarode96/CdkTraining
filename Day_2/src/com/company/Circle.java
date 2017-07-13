package com.company;

/**
 * Created by karodes on 7/13/2017.
 */
public class Circle {

    String brushType;
    int thickness;
    int noOfFingers;

    void paint(String paintBrush, int thickness) {
        System.out.println("Doing painting using brush");
    }
    void paint(int thickness) {
        System.out.println("using hand painting");
    }


}
