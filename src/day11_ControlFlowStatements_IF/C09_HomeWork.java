package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C09_HomeWork {
    public static void main(String[] args) {

        /* double balance = 3450;
        double suit = 3500;
        if (balance>=suit){
            System.out.println("takımı alabilirsiniz");
       }


        int a = 23;
        int b = 24;
        int fark = Math.abs(a-b)%2;

        if (fark==1){
            System.out.println("sayıların farkı tektir");

        }else {
            System.out.println("sayıların farkı çifttir");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ortalama giriniz: ");
        double ort = scan.nextDouble();
        if (ort<40) {
            System.out.println("F");
        }else if (ort<55){
            System.out.println("D");
        }else if (ort<70){
            System.out.println("C");
        }else if (ort<85){
            System.out.println("B");
        }else {
            System.out.println("A");
        }

 */
        int sayi = 44;

        if (sayi>5){
            System.out.println("sayı 5 ten büyüktür");
            if (sayi>25){
                System.out.println("sayı hem 5 ten hem de 25 ten büyüktür");

            }else {
                System.out.println("sayı 5 ten büyük ancak 25 ten küçüktür");
            }
        }else{
            System.out.println("sayı 5 ten küçüktür");
        }

    }
}
