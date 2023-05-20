package mentoring18_Abstract_Polymorphism;


abstract class Car {   // ABSTRACT CLASS
    public abstract void drive(); // declaration
    public abstract void charge();
    public void playMusic(){
        System.out.println("Car playing music");
    }

}
abstract class Honda extends Car  {  // FIRST CONCRETE. THEN ABSTRACT CLASS

    public void drive (){
        System.out.println( "Honda is driving.");
    }
}
class HondaE extends Honda {  // CONCRETE CLASS -> inşaa etmek

    public void charge () {
        System.out.println("HondaE is charging.");
    }

}
public class Demo {
    public static void main(String[] args) {

    HondaE obj = new HondaE();
    obj.drive();
    obj.playMusic();
    obj.charge();
    }
}
/*
    Abstract Method -> Only declaration but not definition

    Abstract Class -->
        Object cannot be created
        Inheritance olması gerekli  -- implementation of abstract
                                     method will be written in subclass

        Normal Methods and Abstract Methods

        Concrete Class

        Object can be instantiated
        class that contains complete definition for all methods


 */
