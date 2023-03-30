package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C12_Tasks2 {

    public static void main(String[] args) {

        // 12. kullanıcıdan 0-1000 arası sayı isteyelim
        // 0-girilen sayı toplayalım

       /* Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 0 - 1000 arası bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int num = 0;
        int toplam = 0;
        while (num<=sayi){
            toplam+=num;
            num++;
        }
        System.out.println(toplam);



        // 13. 0-1000 arası sayı iste o sayıya kadar
        // teklerin ayrı çiftlerin ayrı toplamını yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("0-1000 arası bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int i = 0;
        int toplamTek = 0;
        int toplamCift =0;
        while (i<=sayi){
            if(i%2==1){
                toplamTek+=i;
                i++;
            } else{
                toplamCift+=i;
                i++;
            }


        }
        System.out.println("tek sayıların toplamı "+toplamTek);
        System.out.println("çift sayıların toplamı "+toplamCift);


    // 14. kullanıcıdan taban ve kuvvet bilgisi alıp
    // sonucu ekrana yazdıralım

      Scanner scan = new Scanner(System.in);
      System.out.println("lütfen bir sayı giriniz: ");
      int taban = scan.nextInt();
      System.out.println("Lütfen kuvvet giriniz: ");
      int kuvvet = scan.nextInt();
      int num = 1;
      int carpim = 1;
      while(num<=kuvvet){
          carpim*=taban;
          num++;
      }
        System.out.println(carpim);


       // 15. a - z ekrana yazdır

        char harf = 'a';
        while (harf<='z'){
            System.out.print(" "+harf);
            harf++;
        }

        // 16. 9 sayısının çarpım tablosu

        int i = 1;
        while (i<=10){
            System.out.println("9*"+i+"="+9*i);
            i++;
        }
 */
        // 17. şifre tanımlayın kullanıcıya 3 hak verin
        // kullanıcıyı yönlendirin
        Scanner scan = new Scanner(System.in);
        String sifre = "şafak";
        String tahmin = "";
        int hak = 3;
        System.out.println("lütfen şifre giriniz: ");

         while (hak>0){
             tahmin = scan.nextLine();
             if (tahmin.equals(sifre)){
                 System.out.println("tebrikler doğru şifre");
                 break;
             }else{
                 System.out.println("yanlış şifre. kalan tahmin hakkınız: "+(hak-1));
             }
             hak--;
         }

    }
}
