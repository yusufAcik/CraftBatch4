package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

        // kullanıcıdan sayı alıp çift tek yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz: ");
        int num = scan.nextInt();
        if(num%2==0) {
            System.out.println("çift sayı");
        } else {
            System.out.println("tek sayı");
        }

        System.out.println("----------------------");

        System.out.println(num%2==0? "Cift Sayi":"Tek Sayi");

        System.out.println("----------------------");

        String result = (num%2==0) ? "çift sayı" : "tek sayı";
        System.out.println(result);








    }
}
