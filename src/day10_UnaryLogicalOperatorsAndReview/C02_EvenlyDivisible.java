package day10_UnaryLogicalOperatorsAndReview;

import java.util.Scanner;

public class C02_EvenlyDivisible {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz: ");
        int number = scan.nextInt();

        boolean isDivisibleBy2 = number%2==0;
        boolean isDivisibleBy3 = number%3==0;
        boolean isDivisibleBy5 = number%5==0;

        System.out.println(number+" is divisible by 2 :"+isDivisibleBy2);
        System.out.println(number+" is divisible by 3 :"+isDivisibleBy3);
        System.out.println(number+" is divisible by 5 :"+isDivisibleBy5);







    }
}
