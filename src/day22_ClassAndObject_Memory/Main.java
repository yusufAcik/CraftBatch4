package day22_ClassAndObject_Memory;

public class Main {
    public static void main(String[] args) {
        Daire2 benimDairem=new Daire2();
        benimDairem.r=2;
        System.out.println(benimDairem.alanHesapla());
        Daire2 seninDairen=new Daire2();
        seninDairen.r=5;
        System.out.println(seninDairen.alanHesapla());

        System.out.println(Daire2.alanHesapla2(7));
        System.out.println(Daire2.cevreHesapla2(5));
    }

    //CarNew adında bir class oluşturun
    //fieldları marka,modelAdı,begir
    // farklı bir class da Car clasından 2 adet obje tanımlayın
    // ve bu 2 adet objenin begirlerini karşılaştırın hangisinin
    // begiri büyük ise ekrana onun marka ve modelini yazın
}
