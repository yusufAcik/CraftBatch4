package day19_Custommethods_Return;

import java.util.Scanner;

public class C08_Task {
   // 1.  Create a method that returns the name of the day
    // based on the given number to the method

    public static void main(String[] args) {
        System.out.println("dayOfWeek(6) = " + dayOfWeek(6));
        System.out.println("----------------");
        System.out.println("isLastDigitEqual(55,665) = " + isLastDigitEqual(55, 665));
        System.out.println("----------------");
        System.out.println(makePositive(-33));
        System.out.println("------------------");
        System.out.println(degree(66, 77, 90));
        System.out.println("------------------");
        System.out.println("primeNumber(23) = " + primeNumber(23));
        System.out.println("primeNumber(55) = " + primeNumber(55));
        System.out.println(primeNumber(0));
    }

    /**
     * a method that shows name of weekdays
     * @param number
     * @return
     */

    public static String dayOfWeek(int number){


        String name=" ";
        switch (number){
            case 1 :
                name="Monday";
                break;
            case 2 :
                name="Tuesday";
                break;
            case 3 :
                name="Wednesday";
                break;
            case 4 :
                name="Thursday";
                break;
            case 5 :
                name="Friday";
                break;
            case 6 :
                name="Saturday";
                break;
            case 7 :
                name="Sunday";
                break;
            default:
                name="invalid number";
        }
        return ("Name of day: "+name);
    }

    /**
     * a method that shows two numbers' last digits are equal
     * @param x
     * @param y
     * @return
     */
    public static boolean isLastDigitEqual(int x,int y){
        boolean isEqual=false;
        if(x%10==y%10) isEqual=true;
        return isEqual;
    }

   public static boolean primeNumber (int number){
        boolean prime = true;
        if (number>1){
            for (int i = 2; i < number ; i++) {
                if (number%i==0){
                    prime = false;
                    break;
                }else{
                    prime=true;
                }
            }
        }
        return prime;
    }

    /**
     * a method that makes the negative numbers positive
     * @param x
     * @return
     */
    public static int makePositive(int x){
        if(x<0) x=-x;
        return x;
    }

    public static char degree (int x, int y, int z){
        char degree='ü';
        double ort=(x+y+z)/3;
        if(ort>75) degree='A';
        else if (ort>50) degree='B';
        else degree='C';

        return degree;

    }
}
