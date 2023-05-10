package mentoring14_ThisAndSuper;

class A {

    /*
    1. default constructor
    2.super()
    3.Object class extend olması

    bu 3 ü yazılmasa da vardır

     */

    public A(){
        System.out.println("in A");
    }

    public A(int m){
        System.out.println("in A int");
    }
}

class B extends A{

    public B(){
       // super();  // bunu yazmasak da orada otomatik vardır
        System.out.println("in B");
    }

    public B(int n){
       this(); // bu class ın boş constructor ı üstünde otomatik super() yok
                // çünkü B nin boş cons unda super() zaten var
        System.out.println("in B int");
    }

}

public class Demo{

    public static void main(String[] args) {

        A obj1 = new A();
        B obj = new B();
    }
}


