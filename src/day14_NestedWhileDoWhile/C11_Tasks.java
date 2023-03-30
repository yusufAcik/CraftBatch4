package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C11_Tasks {

    public static void main(String[] args) {
        // day 13 slaytında for tasklarının hepsini
        // while ile yapıyoruz
        // + nested for loop tasks

        // 1. 20 kez alt alta "merhaba dünya yazdır"

        int i =1;
        while (i<=20){
            System.out.println("merhaba dünya");
            i++;
        }
        System.out.println();
        System.out.println("--------------------------------");

        // 2. 0-100 yazdır

        int j = 0;
        while (j<=100){
            System.out.print(" "+j);
            j++;
        }
        System.out.println();
        System.out.println("--------------------------------");

        // 3. 15-100 yazdır

        int k = 15;
        while (k<=100){
            System.out.print(" "+k);
            k++;
        }

        System.out.println();
        System.out.println("--------------------------------");

        // 4. 0-100 tersten yazdır

        int l = 100;
        while (l>=0){
            System.out.print(" "+l);
            l--;
        }

        System.out.println();
        System.out.println("--------------------------------");

        // 5. 0-100 çift sayılar

        int m = 0;
        while (m<=100){
            System.out.print(" "+m);
            m+=2;
        }

        System.out.println();
        System.out.println("--------------------------------");

        // 6. 0-100 tek sayılar

        int n = 1;
        while (n<=100){
            System.out.print(" "+n);
            n+=2;
        }

        System.out.println();
        System.out.println("--------------------------------");

        // 7.  10-1000 arası 10 a bölünebilen tüm sayılar

        int o = 10;
        while (o<=1000) {
            if (o%10==0){
                System.out.print(" "+o);
            }
            o+=10;

        }

        System.out.println();
        System.out.println("--------------------------------");

        // 8. 6!=?

        int p = 6;
        int sonuc = 1;
        while (p>=1){
            sonuc*=p;
            p--;
        }
        System.out.println(sonuc);

        System.out.println();
        System.out.println("--------------------------------");

        // 9. 0-20 küplerini yazdır

        int r = 0;
        while (r<=20){
            System.out.println(r+" "+r*r*r);
            r++;
        }

        System.out.println();
        System.out.println("--------------------------------");

        // 10. 23-50 C tüm fahrenheit değerlerini yazdır

        int c = 23;
        while (c<=50){
            System.out.println(c+" derece "+(c*1.8+32)+" fahrenheittır");
            c++;
        }
        System.out.println();
        System.out.println("--------------------------------");

        // 11. kullanıcıdan bir kelime alıp
        // istediği kadar ekrana yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scan.nextLine();
        System.out.println("kelimeyi kaç kez yazdırmak istersiniz: ");
        int tekrar = scan.nextInt();

        int num = 1;

        while (num<=tekrar){
            System.out.println(kelime);
            num++;
        }


    }
}
