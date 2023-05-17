package mentoring17_Inheritance;

class A{
public void show(){
    System.out.println("in show A");
}
public void config(){
    System.out.println("in config A");
}

}

class B extends A {

    public void show(){
        System.out.println("in show B");
    }
}

class C extends A {


}

/*
class C extends A,B { // hata verir (Ambiguity problem)


}
 */


public class Demo1 {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();   // show metodu B clasında olduğu için onu çalıştırdı
                        // (method overriding)
        obj.config();  // B clasında config metodu yok; parent clastakini çalıştırdı
    }
}
