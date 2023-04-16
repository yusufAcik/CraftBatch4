package day30_Review;

import java.util.Scanner;

public class C03_IsPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check the number is prime");
        int num=scan.nextInt();
        if(isPrime(num)){
        System.out.println("Prime");
    } else
        {System.out.println("Not prime"); }
    }


    public static boolean isPrime (int num){
       boolean result=false;
       int factor=0;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                factor++;
            break;
            }
        }
        if(num<2){
            result=false;
        } else if (num==2) {
            result=true;
        } else if (factor==0) {
            result=true;
        }else {
            result=false;
        }
        return result;
    }


    // // Write a method that takes an integer and check
    // if the number is prime and returns a boolean
}
