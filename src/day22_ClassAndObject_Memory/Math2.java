package day22_ClassAndObject_Memory;

public class Math2 {

    public static double pow(int base, int power){

        int result=1;
        for (int i = 1; i <=power ; i++) {

            result*=base;

        }
        return result;
    }

}
// pow methodu oluşturalım
// Ödev: Math2 sınıfı oluşturun ve pow(taban, kuvvet)
// methodu yazın. Main sınıfı içerisinde
//oluşturduğunuz sınıf içerisinden hesaplama yaptırın.
//Math2.pow(2,3)=8
