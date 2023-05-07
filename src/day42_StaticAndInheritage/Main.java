package day42_StaticAndInheritage;
import static java.lang.Math.*; // Math sınıfının tüm static methodlarını import ettik
                                // static import tavsiye edilmez
public class Main {
    public static void main(String[] args) {
        A.staticMethod();
        A.staticVariable.length();
        // static method ve variable ı class ismi (A) ile çağırabiliriz.

        A a=new A();
        a.normalMethod();
        a.normalVariable.isEmpty();
        // static olmayan method ve variable ları çağırmak için
        // o class tan bir nesne oluşturmak gerekir

        B b=new B();
        B b1=new B(4);
        B b2=new B(5);

        pow(20,2);   // bu şekilde kullanmak için method yazmalıyız

        pow(3,3);  // ya da Math sınıfından import edererek doğrudan kullanabiliriz


      //   DısKlass.IcKlass.  iç klası çağırdığımızda dış klasla birlikte gelir

        Bird bird = new Bird();
        bird.name="CikCik";
        bird.yemekYe();

        Animal animal=new Animal();
        // animal.  sadece Animal sınıfının özelliklerini görür
        Bird bird1 = new Bird();
        // bird1. Animal sınıfı ve Bird sınıfının bütün özelliklerini görür

        Papagan papa = new Papagan();
        papa.isTalking=true;



    }

    public static double pow(double x, double y){
        int result=1;
        for (int i = 0; i < y; i++) {
            result*=x;
        }
        return result;
    }


}
