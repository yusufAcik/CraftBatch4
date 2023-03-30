package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args){

        // 1. Scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);

        // 2. kullanıcıyı bilgilendir ne istediğini söyle

        System.out.println("lütfen isminizi giriniz");

        // 3 girilen bilgiyi içine koyabileceğiniz variable
        // oluşturun içine, girilen veriyi alın

        String name=scan.nextLine();

        System.out.println("Girilen isim: "+name);

        scan.close(); // kullanmayacağımız scani kapatıyoruz



    }

}
