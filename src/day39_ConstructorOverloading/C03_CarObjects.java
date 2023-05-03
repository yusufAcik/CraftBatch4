package day39_ConstructorOverloading;

public class C03_CarObjects {

    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println("car1.otomatikMi = " + car1.otomatikMi);
        System.out.println("car1.marka = " + car1.marka);
        System.out.println("car1.hiz = " + car1.hiz);

        System.out.println("----------------");

        Car car2=new Car("WV");
        System.out.println("car2.otomatikMi = " + car2.otomatikMi);
        System.out.println("car2.marka = " + car2.marka);
        System.out.println("car2.hiz = " + car2.hiz);

        System.out.println("--------------------");

        Car car3=new Car("Honda","Civic");
        System.out.println("car3.marka = " + car3.marka);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3 = " + car3);
        System.out.println("Car.renkSec(car3,\"kırmızı\") = " + Car.renkSec(car3, "kırmızı"));
    }

}
