package day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {


        // bilgisayarın tuttuğu 0-50 arası sayıyı
        // 5 hamlede bulalım
        // düşük tahminde yukarı
        // yüksekte aşağı diye yönlendirme

        Random random=new Random();
        int sayi = random.nextInt(50);

/*
        int tahminHakki = 5;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("lütfen sayıyı tahmin ediniz. kalan tahmin hakkı :"+tahminHakki);
            int tahmin = scan.nextInt();
            tahminHakki--;
            if(tahminHakki==0){
                System.out.println("hakkınız kalmadı. tuttuğum sayı : "+sayi);
                break;
            }
            if (tahmin==sayi){
                System.out.println("tebrikler");
                break;
            }else if (tahmin<sayi){
                System.out.println("yukarı");
            }else{
                System.out.println("aşağı");
            }
   }
    */  Scanner scan = new Scanner(System.in);
        int i=1;
        while(i<=5){
            System.out.print(i+". Tahmin: ");
            int tahmin= scan.nextInt();
            if(tahmin>sayi&&i!=5){
                System.out.println("Aşağı");
            }else if(tahmin<sayi&&i!=5){
                System.out.println("Yukarı");
            }else if(tahmin==sayi){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if(i==6){
                System.out.println("maalesef bilemedin. tuttuğum sayı: "+sayi);
            }
        }

}


}
