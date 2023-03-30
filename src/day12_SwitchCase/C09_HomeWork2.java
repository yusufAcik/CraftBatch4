package day12_SwitchCase;

import java.util.Scanner;

public class C09_HomeWork2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        double a = scan.nextDouble();
        System.out.println("lütfen bir sayı daha giriniz: ");
        double b = scan.nextDouble();
        System.out.println("yapmak istediğiniz işlemi giriniz(ör:+,-,*,/)");
        String islem = scan.next();

        switch (islem){
            case ("+"):
                System.out.println(a+b);
                break;
            case ("-"):
                System.out.println(a-b);
                break;
            case ("*"):
                System.out.println(a*b);
                break;
            case ("/"):
                System.out.println(a/b);
                break;
            default:
                System.out.println("hatalı giriş");


        }
    }
}
