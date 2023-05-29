package day58_JavaReview_3;

import day58_JavaReview_3.abstractionReview.*;

public class C02_PolymorphismReview {
    public static void main(String[] args) {

     //   Car car = new Car(); // abstract class tan obje olmaz

        Car car1 = new Tofas();
        Car car2 = new BMW();
        Car car3 = new Audi();
        Car car4 = new Tesla(); // Typecasting upcasting


      //  Autopilot autopilot = (Autopilot) new Tofas();
       // System.out.println(autopilot);   // ClassCastException verdi

        Autopilot autopilot = new BMW();
        autopilot.autoPark();

        Car electricCar = new Tesla();
        electricCar.driver();
        electricCar.start();
        electricCar.stop();
       // electricCar.autoPark(); // Reference type decides what to be access
        ((Tesla)electricCar).autoPark(); // typecasting downcasting

    }
}
