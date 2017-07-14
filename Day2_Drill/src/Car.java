/**
 * Created by karodes on 7/14/2017.
 */
public class Car extends Vehicle {

    public Car(String engineType, String steeringType, int numberOfWheels, int topSpeed, int noOfShifts, int acceleration) {
        super(engineType, steeringType, numberOfWheels, topSpeed, noOfShifts, acceleration);
    }

    @Override
    void drive() {
        System.out.println("Driving Car");
    }

    @Override
    void inspect() {
        System.out.println("Inspecting Car");
    }
}
