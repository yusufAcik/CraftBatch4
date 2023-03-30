package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C01_MinimumNumber {

    public static void main(String[] args) {

        // kullanıcıdan 5 sayı alın en küçüğünü yazdırın

        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;    // 2147483647
        System.out.println(min);

        for (int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int num= scan.nextInt();
            if (num<min){
                min=num;
            }
        }
        System.out.println("min ="+min);




    }
}
