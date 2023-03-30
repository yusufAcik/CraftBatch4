package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C10_SayiTahminProgrami {

    public static void main(String[] args) {

        int sayi = 45;

        Scanner scan = new Scanner(System.in);
        System.out.println("tahmini bir tam sayı giriniz: ");
        int tahmin = scan.nextInt();


        if (tahmin<sayi){
            System.out.println("tahmin sayıdan küçük");
            if ((sayi/tahmin)<2){
                System.out.println("yaklaştınız");
            }else{
                System.out.println("uzaklaştınız");
            }
        }else if(tahmin==sayi){
            System.out.println("tebrikler");
        }else{
            System.out.println("tahmin sayıdan büyük");
            if ((tahmin/sayi)>2){
                System.out.println("fark çok büyük");
            }else {
                System.out.println("fark küçük");
            }
        }


    }
}
