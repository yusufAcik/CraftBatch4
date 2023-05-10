package day46_AbstractClassAndInterface.day46_Car;

public class MyGarage {

    public static void main(String[] args) {
      //  Car car1=new Car("Tesla","Model 3","black",2023,50000.0);
        // Car klası abstract olduğu için bu klastan nesne üretemeyiz


        Honda honda=new Honda("Accord","Black",2023,15000);
        Audi audi=new Audi("RS6","Red",2023,3500000);
        Tesla tesla=new Tesla("Model 3","White",2022,5500000);

        System.out.println(honda);  // class içine yazdığımız toString metodu ile direkt yazdırabiliyoruz
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("----------------------");

        honda.setColor("Blue");
        audi.setPrice(4500000);
        tesla.setColor("Red");

        System.out.println(honda.getColor());
        System.out.println(audi.getPrice());
        System.out.println(tesla.getColor());


    }
}
