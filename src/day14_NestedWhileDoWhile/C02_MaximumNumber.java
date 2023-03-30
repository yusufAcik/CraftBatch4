package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C02_MaximumNumber {

    public static void main(String[] args) {
        // kullanıcıdan 5 sayı al en büyüğünü bul

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println(max); // -2147483648

        for (int i=1; i<=5;i++){
            System.out.println("Lütfen bir sayı giriniz: ");
            int num = scan.nextInt();
            if (num>max) {
                max=num;
            }
        }

        System.out.println("max = "+max);

    }

}
