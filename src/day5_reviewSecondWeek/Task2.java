package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {

        // kullanıcıdan sayı alıp çift sayı olup olmadığını kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int number = scan.nextInt();

        boolean isEven = number%2==0; // ya da  !(number%2==1)

        System.out.println(number+" çift sayıdır: "+isEven);

        boolean isOdd = number%2==1; // ya da !(number%2==0);

        System.out.println(number+ " tek sayıdır: "+isOdd);




    }

}
