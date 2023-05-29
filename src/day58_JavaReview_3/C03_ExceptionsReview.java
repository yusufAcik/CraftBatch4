package day58_JavaReview_3;

import day58_JavaReview_3.abstractionReview.Car;
import day58_JavaReview_3.abstractionReview.Tofas;

import java.util.ArrayList;
import java.util.List;

public class C03_ExceptionsReview {
    public static void main(String[] args) {

        List<Car> MyGarage;
        MyGarage = new ArrayList<>() ;

     //   while (true){
     //       MyGarage.add(new Tofas());
     //   }

        // OutOfMemoryError can not be handled; resources are limited;
        // can not be done anything

     //   methodWithRuntimeException();
        System.out.println("***");

        String str = "ABC";

        try {
            int num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.err.println("Invalid numeric format"+str);
            e.printStackTrace();
        }finally {
            System.out.println("Hi guys");
        }

        System.out.println("Bye bye Java");;

    }

    public static void methodWithRuntimeException() throws  Exception{
        throw new RuntimeException("This is a Runtime Exception");
    }
}
