package day4_Review;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args){

        int abc=6;
        System.out.println(abc);
        System.err.println("yanlış");

        Scanner sc = new Scanner(System.in);

        System.out.println("Adınızı giriniz:");
        String name = sc.nextLine();
        System.out.println("adı "+name+" miş");

        System.out.println("bir sayı giriniz : ");
        int num1= sc.nextInt();
        System.out.println(num1+5); // num1+=5

        System.out.println("boyunuzu giriniz : ");
        float boy = sc.nextFloat();
        System.out.println("boy "+boy);

        System.out.println("boyunuzu giriniz : ");
        double boy1 =sc.nextDouble();
        System.out.println("boy "+boy1);

        sc.nextLine(); // ya da yeni bir scan sınıfı oluşturmalıyız
                        // Scanner sc1 = new Scanner(System.in);

        System.out.println("lütfen soyadınızı giriniz : ");
        String soyAd = sc.nextLine();
        System.out.println("soyadınız: "+soyAd);





    }

}
