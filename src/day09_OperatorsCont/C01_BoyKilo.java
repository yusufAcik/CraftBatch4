package day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz :");
        double boy = input.nextDouble();

        System.out.println("kilonuzu giriniz :");
        double kilo = input.nextDouble();

       // input.nextLine();

        // Scanner.nextline() ilk entera kadar girilen değerleri alır
        // Scanner.next() ilk space boşluğa kadar olan değerleri alır bir kelime hakkımız var



        System.out.println("Lütfen isminizi giriniz:");
        String isim = input.next();

        input.nextLine();

        System.out.println("Lütfen soyisminizi giriniz:");
        String soyIsim = input.nextLine();

        System.out.println(isim+" "+soyIsim+" Boyunuz: "+boy+" kilonuz: "+kilo);




    }


}
