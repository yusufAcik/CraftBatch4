package day49_Exception;

import java.util.Scanner;

public class C02_Exception_2 {

    public static void main(String[] args) {

        System.out.println(bolme(5,0));

        System.out.println(sayiGir());

        Scanner scan = new Scanner(System.in);
        System.out.println("Kod başladı");

        try {
            int x=5/0;
        }catch (Exception e){
            System.out.println("Hata: "+e.getMessage());
            System.out.println("Kararınız nedir? (1. İşleme devam, 2 programı sonlandır)");
            int karar= scan.nextInt();
            if(karar!=1){
                System.exit(0);
            }
        }
        System.out.println("Kod devam ediyor");



    }

    public static int bolme(int sayi,int bolen){
        try {
            return sayi/bolen;
        }catch (Exception e){
            System.out.println(e.toString());
            return -1;

        }
    }


    // hatayı yazdırma seçenekleri:
    // 1. e.printStackTrace() : java.lang.AritmeticException: / by zero (void) (hatayı kırmızı yazdırır)
    //      **** çoğu developer printStackTrace i kullanır****
    // 2. e.getMessage() : by zero (String)
    // 3. e.toString() : java.lang.AritmeticException: / by zero (String)

    public static int sayiGir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi :");
        int sayi;

        try {
            sayi= scan.nextInt();
            return sayi;
        }catch (Exception e){
            System.out.println("Hatalı giriş, tekrar deneyiniz.");
            return sayiGir();
        }

    }

}
