package day08_ScannerAndOperators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_ScannerTask1 {

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz:");

        int sayi= scan.nextInt();

        System.out.println("girilen sayının karesi: "+sayi*sayi);


        scan.close();


    }
}
