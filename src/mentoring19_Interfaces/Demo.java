package mentoring19_Interfaces;

interface A{

    int AGE=55;
    String NAME="yusuf";
    // değişkenler static ve final olarak belirlenir.
    public abstract void show(); // public abstract yazmaya gerek yok
                            // bütün metodlar public abstract
    void config();
}

/*
ABSTRACT VE INTERFACE FARKLARI
1. interface içinde sadece public ve abstract claslar bulunur
    abstract claslarda hem abstract metodlar hem de definition ı
    yapılmış metodlar bulunur.
 2. interface clas değildir.
 */

interface X {
    void run();
}

class B implements A,X{

    public void show() {
        System.out.println("Showing...");
    }


    public void config() {
        System.out.println("Config...");

    }
    public void run() {
        System.out.println("Running...");

    }
}

public class Demo {
    public static void main(String[] args) {
    A obj;
    obj=new B();
    obj.config();
    obj.show();
   //  obj.run();  obj A ya implement olduğu için
                // X ten gelen metodu çalıştırmaz
     X obj1=new B();
     obj1.run();

     // NAME ve AGE static olduğu için obje oluşturmadan
        // class ismiyle çağırabiliriz

        System.out.println(A.AGE);
        System.out.println(A.NAME);

    }

    /*
    class to class EXTENDS
    interface to class IMPLEMENTS
    interface to interface EXTENDS
     */
    /*
    implement edilen 2 farklı interface de aynı isimli metodu içerebilir
    metodlar boş olduğu ve implement eden clasta doldurulacağı için problem olmaz
     */
}
