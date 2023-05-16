package day49_Exception;

import java.util.Scanner;

public class C01_Exception_1 {

    public static void main(String[] args) {

        //// stackoverflow.com  ->  yazılımla ilgili soru-cevaplar /////
        /*
       Exception ın amacı; hata almamızın muhtemel olduğu yerlerde
       Java nın bize gönderebileceği hatayı alarak kodun geri kalan
       kısmının devamını sağlamak
       ** Exception, bir hata vs sonucu oluşan bir objedir.
         */

        // mülakatlarda exception türleri sorabilirler 3 tanesini bilmek gerekir
        // indexOutOfBound, aritmeticIndexOutOfBound,numberForwardException

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");

        try {
            int x = scan.nextInt();
            System.out.println(x*10);
        } catch (Exception e){
            System.out.println("Hata alındı.");

        }



        System.out.println("Kod devam ediyor....");
        System.out.println("Kod devam ediyor....");
        System.out.println("Kod devam ediyor....");
    }
}
