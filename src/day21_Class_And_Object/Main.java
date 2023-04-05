package day21_Class_And_Object;

public class Main {
    public static void main(String[] args) {

        Daire daire1=new Daire();
        daire1.r=5;
        daire1.alanHesapla();
        System.out.println("daire1.cevreHesapla() = " + daire1.cevreHesapla());
        Daire daire2=new Daire();
        daire2.r=20;
        daire2.alanHesapla();
    }
}
