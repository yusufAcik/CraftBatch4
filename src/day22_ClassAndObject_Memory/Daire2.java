package day22_ClassAndObject_Memory;

public class Daire2 {

    double r;
    double pi=Math.PI;

    public double alanHesapla(){
        return Math.pow(r,2)*Math.PI;
    }

    public static double cevreHesapla2(int r){
        return (2*Math.PI*r);
    }

    // static method oluşturursak dışarıdan kolayca
    // çağırıp işlem yapabiliriz
    // static olmayan bir metodu static bir methodun
    // içinde kullanamayız
    // objeler için de bu durum geçerli
    public static double alanHesapla2(int yariCap){
        double result=yariCap*yariCap*3.14;
        return result;
    }

}
