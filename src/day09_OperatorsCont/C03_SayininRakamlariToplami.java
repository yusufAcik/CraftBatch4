package day09_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamlariToplami {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı bir sayı giriniz :");

        int number = scan.nextInt(); // 142 -> 1+4+2
        int lastDigit = number%10;  // lastDigit=2
        int totalOfDigits = lastDigit; //2

        number = number/10; //14
        // number /=10;
        lastDigit = number%10; // 4
        totalOfDigits = totalOfDigits+lastDigit;    // 2+4=6

        number = number/10; // 14/10 = 1
        lastDigit = number%10; // 1
        totalOfDigits = totalOfDigits+lastDigit; // 6+1=7
        //  totalOfDigits += lastDigit; // üst satırın kısayolu


        System.out.println("girilen sayının rakamları toplamı : "+totalOfDigits);







    }
}
