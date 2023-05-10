package day46_AbstractClassAndInterface.day46_Car;

public class Tesla extends Car{

    public Tesla(String model,String color,int year,double price){
        super("Tesla",model,color,year,price);
    }
    public void start(){
        System.out.println("Say \"Start\" to start the engine");
    }
    public void zoom(){
        System.out.println("Zoom meeting is starting, smile the camera");
    }
}
