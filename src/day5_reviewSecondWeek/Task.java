package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("lütfen 3 basamaklı bir sayı giriniz: ");

        int number = sc.nextInt();

        int birler = number%10;
        System.out.println("birler = " + birler);

        int onlar = (number/10)%10;
        System.out.println("onlar = " + onlar);

        int yuzler = number/100;
        System.out.println("yuzler = " + yuzler);

        int yeniSayi = birler*100+onlar*10+yuzler;
        System.out.println("yeniSayi = " + yeniSayi);

        String birlerStr = Integer.toString(birler);
        String onlarStr = Integer.toString(onlar);
        String yuzlerStr = Integer.toString(yuzler);

        String result = birlerStr+onlarStr+yuzlerStr;
        System.out.println("result = " + result);


    }

}
