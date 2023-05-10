package day46_AbstractClassAndInterface.day46_Car;

public final class Honda extends Car{ // final yaparak başka class ın extend etmesini engelledik

    public Honda(String model,String color,int year,double price){
        super("Honda",model,color,year,price);
    }
    public void start(){
        System.out.println("Twist the key to start.");
    }

    public void stop(){     // Car sınıfında abstract metod değil
                        // o yüzden burada yapmak zorunda değiliz
        System.out.println("ABS system need");
    }
}
