package day46_AbstractClassAndInterface.day46_Car;

public final class Audi extends Car{

    public Audi(String model,String color,int year,double price){
        super("Audi",model,color,year,price);
    }

    public void start(){
        System.out.println("Press key to start the engine");
    }
    public void quatro(){  // bu metodu isteğe bağlı yaptık (abstract classtan bağımsız)
        System.out.println("Quatro feature is active");
    }
}
