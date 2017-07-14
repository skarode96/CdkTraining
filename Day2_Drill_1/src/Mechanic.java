/**
 * Created by karodes on 7/14/2017.
 */
public class Mechanic {

    public static void main(String[] args) {
        Bike b1 = new Bike("220cc","handle",2,180,5,40);
        Car c1 = new Car("Diesel 1000cc", "Power",4,200,5,60);
        c1.display();
        b1.display();
        c1.inspect();
        b1.inspect();
    }
}
