package day16_Branching_Statements;

import java.util.Scanner;

public class C02_Branching_Statements {

    public static void main(String[] args) {

        // break continue return(metodu sonlandırır)

        // continue her zaman kodu başa döndürür,
        // alta yazılanları görmez


 /*       System.out.println("program başladı");
        int x=0;
        for(int i=0; i<100; i++) {
            x++;
            if(x==5){
                break;
            }
            System.out.print(x+" ");
        }
        System.out.println("program sonlandı.");

        System.out.println("--------------");

        for (int j = 0; j < 10; j++) {
            if (j%2==0){
                continue; // döngünün başına döndürür aşağı indirmez
            }
            System.out.print(j+" ");
            System.out.println();
        }

        System.out.println("--------------");

        for (int k = 0; k < 100; k++) {
            if(k%2==0){
                continue;
            }
            if(k>10){
                break;
            }
            System.out.print(k+" ");

        }

        // 0-20 çift sayıların toplamını ekrana yazdıran program
        System.out.println();
        System.out.println("--------------");
        int toplam =0;
        for (int l = 0; l <=20 ; l+=2) {
           toplam+=l;
        }
        System.out.println(toplam);

        System.out.println();
        System.out.println("--------------");

        int sum=0;
        for (int m = 0; m <=20 ; m++) {
            if(m%2==0){
                sum+=m;
            }
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("--------------");

        int sum1=0;
        for (int n = 0; n <=20 ; n++) {
            if(n%2==1){
            continue;
        }
        sum1+=n;

    }
        System.out.print(sum1);

        System.out.println();
        System.out.println("--------------");

        // 1-100 5 in katlarını ekrana yazdıran
        // programı continue kullanarak

        for (int o = 1; o <=100 ; o++) {
            if(o%5!=0){
                continue;
            }
            System.out.print(o+" ");
        }


        for (int i = 0; i < 2; i++) {
            System.out.print("B");

            for (int j = 0; j < 4; j++) {
                if(j>2) {
                    continue;
                }
                System.out.print("A");
            }
        }


        for (int i = 0; i < 2; i++) {
            System.out.print("B");

            for (int j = 0; j < 10; j++) {
                if(j==5){
                    System.out.print("C");
                    break;
                }
                if(j>2){
                continue;
                }
                System.out.print("A");
            }

        }


        // şifre tanımla kullanıcıdan 5 şifre iste
        // şifre yanlışsa ikaz doğruysa tebrik ve programdan çıkış
        // while ile


        Scanner scan = new Scanner(System.in);

        String sifre = "yusuf123";
        int i =0;
        System.out.println("5 hakkınız var.");
        while(i<5){
            System.out.print(i+1+". Tahmin: ");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if(i==5){
                System.out.println("hatalı. güle güle");
                break;
        }
            System.out.println("Tekrar deneyiniz");

        }
*/

         // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
    // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0
        // işlemlere devam etmek için 1 giriniz


        Scanner scan = new Scanner(System.in);


            outerLoop: while(true){
                System.out.println(" 1-toplama 2-Çıkarma 3-çarpma 4-çıkış ");
                int tercih = scan.nextInt();
                    if(tercih==1){
                        loop1:while (true){
                            System.out.print("1. Sayı: ");
                            int x= scan.nextInt();
                            System.out.println("2. Sayı: ");
                            int y = scan.nextInt();
                            System.out.println("işlem sonucu: "+(x+y));
                            System.out.println("üst menü için 0, devam için 1, çıkış için 2");
                            int tercih2 = scan.nextInt();
                            if(tercih2==0){
                                break;
                            }else if (tercih2==1){
                                continue loop1;
                            }else {
                                System.out.println("hatalı işlem.çıkış");
                                break outerLoop;
                            }
                        }
                    }else if(tercih==2){
                    while (true){
                        System.out.print("1. Sayı: ");
                        int x= scan.nextInt();
                        System.out.println("2. Sayı: ");
                        int y = scan.nextInt();
                        System.out.println("işlem sonucu: "+(x-y));
                        System.out.println("üst menü için 0, devam için 1, çıkış için 2");
                        int tercih2 = scan.nextInt();
                        if(tercih2==0){
                            break;
                        }else if (tercih2==1){
                            continue;
                        }else {
                            System.out.println("hatalı işlem.çıkış");
                            break outerLoop;
                        }
                    }
                }
            }


    }
}
