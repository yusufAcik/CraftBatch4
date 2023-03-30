package day10_UnaryLogicalOperatorsAndReview;

import java.util.Scanner;

public class C01_PositiveOrNegative {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: " );

         int number = scan.nextInt();
         boolean isPositive = number > 0;
         boolean isNegative = number < 0;
         boolean isZero = number == 0;

         System.out.println(number+" is positive number: "+isPositive);
         System.out.println(number+" is negative number: "+isNegative);
         System.out.println(number+" is zero: "+isZero);









    }
}
