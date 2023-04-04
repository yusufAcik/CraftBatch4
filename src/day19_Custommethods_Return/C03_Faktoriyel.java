package day19_Custommethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println("faktoriyelHesapla(4) = " + faktoriyelHesapla(4));
    }

    // verdiğimiz sayının faktöriyelini hesaplayıp
    // sonucunu bize döndüren bir metod
    /* method oluşturma aşamaları
    1. public static(standart)
    2. method bize sonuç döndürecekse data tipini belirtiyoruz
    3. method adı
    4. methodun parantezi(), parametre olup olmayacağı,
        parametre data tipleli ve isimleri parantez içine yazılır
    5. {} body aç, döndürülmesi gereken işlemi yap,
    6. return keyword ile döndürülmesi planlanan değeri döndür

     */
    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++){

            faktoriyel*=i;
        }
        return faktoriyel;
    }
}
