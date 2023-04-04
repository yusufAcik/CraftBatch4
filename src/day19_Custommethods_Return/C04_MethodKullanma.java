package day19_Custommethods_Return;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan küçük iki sayı giriniz");
        int i1= scan.nextInt();
        int i2= scan.nextInt();

        int sonuc = C03_Faktoriyel.faktoriyelHesapla(i1)+C03_Faktoriyel.faktoriyelHesapla(i2);
        System.out.println("sonuc = " + sonuc);
    }
}
