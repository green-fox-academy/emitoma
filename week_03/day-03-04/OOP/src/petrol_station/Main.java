package petrol_station;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(100, 30);
        Station petrolStation = new Station();
        petrolStation.refill(myCar);




    }

}
