package day13_ForLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C09_Tasks {

    public static void main(String[] args) {

        // 10 ile 100 arası 10 tam bölünebilen sayıları yazdıralım

      for(int i=10; i<=100; i+=10 ){
          System.out.print(i+" ");
      }
        System.out.println();
        System.out.println("--------------------------");

        // 6! = ?

        int num = 6;
        int faktoriyel=1;

        for(int i=1; i<=6; i++){
            faktoriyel*=i;
        }
        System.out.println(num+" ! ="+faktoriyel);

        System.out.println();
        System.out.println("--------------------------");

        // kullanıcıdan bir kelime alarak kaç defa isterse yazdıralım

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scan.nextLine();
        System.out.println("Girdiğiniz kelimeyi kaç kez yazdırmak istersiniz?(1,2,3,...)");
        int tekrar = scan.nextInt();
        scan.close();
        for (int i=1; i<=tekrar; i++){
            System.out.println(kelime);
        }

        System.out.println();
        System.out.println("--------------------------");

        // kullanıcıdan 0-1000 arası sayı alıp 0-girilen sayı
        // sayıların toplamını yazdıralım

        Scanner sc = new Scanner(System.in);
        System.out.println("0-1000 arası bir sayı girin: ");
        int sayi = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=sayi; i++){

            sum+=i;
        }
        System.out.println("0+1+2+3+.....+"+sayi+"="+sum);

        System.out.println();
        System.out.println("--------------------------");

        // 0-1000 arası bir sayı isteyelim
        // 0-girilen sayı tek ve çift sayıların toplamını
        // ayrı ayrı yazdıralım

        Scanner scan = new Scanner(System.in);
        System.out.println("0-1000 arası bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sumCift = 0;
        int sumTek = 0;

        for(int i=0; i<=sayi; i++){
          if (i%2==0){
            sumCift+=i;
          }else{
            sumTek+=i;
          }

        }

      System.out.println("çift sayılar toplamı: "+sumCift);
      System.out.println("tek sayılar toplamı: "+sumTek);
*/
      // taban ve tavan kuvvetini alarak üslü sayı yazalım

      Scanner scan = new Scanner(System.in);
      System.out.println("Taban kuvveti giriniz: ");
      int taban = scan.nextInt();
      System.out.println("Tavan kuvveti giriniz: ");
      int tavan = scan.nextInt();
      int us = taban;

      for (int i=2; i<=tavan; i++){
        us*=taban;
      }
      System.out.println(taban+"^"+tavan+"="+us);

    }
}
