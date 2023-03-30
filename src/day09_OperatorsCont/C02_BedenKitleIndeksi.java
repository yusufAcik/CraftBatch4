package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleIndeksi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        int kilo = scan.nextInt();

        System.out.print("Boyunuzu giriniz : ");
        double boy = scan.nextDouble();

        double bki = kilo/(boy*boy);

        System.out.println("kilonuz : "+kilo);
        System.out.println("boyunuz : "+boy);
        System.out.println("Beden kitle indeksiniz : "+bki);


    }
}
