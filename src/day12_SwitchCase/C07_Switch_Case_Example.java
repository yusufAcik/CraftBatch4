package day12_SwitchCase;

import java.util.Scanner;

public class C07_Switch_Case_Example {

    public static void main(String[] args) {

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        double a = scan.nextDouble();
        System.out.println("bir sayı daha giriniz:");
        double b = scan.nextDouble();
        System.out.println("yapmak istediğiniz işlemi giriniz(ör: +,-,*,/):");
        String islem = scan.next();

        switch (islem) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("hatalı giriş yaptınız");


            
        }

        // haftanın günlerini yazdıralım 1 pzt 2 salı vs

        int gunSira = 6;

        switch (gunSira) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatalı giriş");

        }
*/
        // beden numaralarına göre s m l ayarla

        int beden = 50;
        switch (beden) {
            case 38,40,42:
                System.out.println("small");
                break;
            case 44,46,48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
                break;
            default:
                System.out.println("beden elimizde yoktur");



        }

    }
}
