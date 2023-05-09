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

        Sekiller sekil = new Sekiller();
        sekil.alanHesapla(); // Alan Hesaplanıyor  yazacak

        Daire daire=new Daire();
        daire.yariCap=2;
        System.out.println("daire.alanHesapla() = " + daire.alanHesapla());
        // dairenin alanını hesaplar 12 yazar

        Kare kare=new Kare();
        kare.kenarUzunlugu=12;
        System.out.println("kare.alanHesapla() = " + kare.alanHesapla());
        // karenin alanını hesaplar 144 yazar  (method overriding yaptık)

        Motorcyle motorcyle1=Motorcyle.motorsikletOlustur();
        motorcyle1.start();


    }
}
