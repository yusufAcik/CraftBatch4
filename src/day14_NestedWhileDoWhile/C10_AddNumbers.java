package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C10_AddNumbers {

    public static void main(String[] args) {

        // kullanıcıdan devamlı sayı isteyin girdiği sayıları
        // toplayın. kullanıcı 0 girdiğinde programdan çıkmasını sağlayın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int n = scan.nextInt();
        int sum = n;

        while (n!=0){
            System.out.println("Toplanmasını istediğiniz sayıyı giriniz: ");
            n=scan.nextInt();
            sum+=n;
        }
        System.out.println("Girdiğiniz Tüm Sayıların Toplamı = "+sum);


    }
}
