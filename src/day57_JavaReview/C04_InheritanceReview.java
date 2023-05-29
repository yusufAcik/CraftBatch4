package day57_JavaReview;

/*final*/  class  A { // class final olursa kimse extend edemez
    public A() {
        System.out.println("The constructor of Class A is executing.");
    }

    public int x;
    public final static int y=33;

    public void /* final */ methodA(){  // metodu final yaparsak başka class override edemez
        System.out.println("Method A");
    }

}

class B extends A{
    public B() {
        System.out.println("The constructor of Class B is executing.");
    }

    public void methodA(){
        System.out.println("Method A (overridden by class B)");
    }
}

public class C04_InheritanceReview {
    public static void main(String[] args) {

        A obj = new A();
        System.out.println("-------------");
        B objB=new B(); // A constructor ı da çalışır
        System.out.println("objB.x = " + objB.x);
        System.out.println("objB.y = " + objB.y);
       //   objB.y=42; can not be reassinged since final
        objB.methodA();
    }
}
