package day10_UnaryLogicalOperatorsAndReview;

import java.util.Scanner;

public class C03_SwapVariables {

    public static void main(String[] args){

    // writing a program that can swipe variables' value
    // by using a temporary value

        Scanner scan = new Scanner(System.in);
        System.out.println("a sayısı için bir tam sayı giriniz:");
        int a = scan.nextInt();

        System.out.println("b sayısı için bir tam sayı giriniz:");
        int b = scan.nextInt();

     //  int a = 10;
      //  int b = 15;

        System.out.println("a: "+a);       //10
        System.out.println("b = " + b);     //15

        int temp=a; //temp=10

        a=b; // a=15
        b=temp;   // b=10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
