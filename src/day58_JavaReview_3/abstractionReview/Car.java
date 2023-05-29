package day58_JavaReview_3.abstractionReview;

public abstract class Car {

    public String brand, model, color;

 //   public final void driver(){
   //     System.out.println("I am driving a"+color+" "+brand+" "+model);
   // }
    public abstract void driver();

    public abstract void start(); // these methods are not completed
                                  // all the child classes extends to this class must implement this methods
                                  // can not private, final, static
    public abstract void stop(); // may have different implementations
}
