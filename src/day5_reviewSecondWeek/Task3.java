package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       /* System.out.println("lütfen bir sayı giriniz: ");
        int num1 = scan.nextInt();

        System.out.println("lütfen bir sayı daha giriniz: ");
        int num2 = scan.nextInt();
*/
        System.out.println("lütfen iki sayı giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        boolean isOdd = (num1-num2)%2==1;

        System.out.println("girilen sayıların farkı tek midir: "+isOdd);




    }
}
