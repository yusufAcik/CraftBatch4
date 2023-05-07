package day43_InheritanceAndAccessKeywords;

public class Main {

    public static void main(String[] args) {
        Parent yusuf = new Parent("abc");
        Child ali = new Child("xyz");

        Parent.staticParentMethod();
        Parent.s=0;
        Child.staticParentMethod();
        Child.s=0;   // Parent clas ındaki statik method ve variable ı
                     // Child clas ı üzerinden de çağırabiliriz

        Vehicle vehicle=new Vehicle();
        Automobile automobile=new Automobile();
        Motorcyle motorcyle=new Motorcyle();

        vehicle.start();
        motorcyle.start(); // overriding method

    }
}
