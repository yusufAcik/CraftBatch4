package mentoring04_LogicalOperators_IfStatements;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        //bir işci 2 saatin altındaki çalışma için 10
        // 2 ile 5 saat arası    20
        // 5 saatten fazla çalışırsa 35 dolar alıyor

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen çalışma süresini saat olarak giriniz: ");
        int sure = scan.nextInt();
        int ucret = 0;
        if(sure<=2){
            ucret=10;
        }else if(sure<=5){
            ucret = 20;
        }else {
            ucret = 35;
        }
        System.out.println(ucret+" $ kazandınız");

        // ternary ile

       // int kazanc = 0;
       // kazanc = (sure<2) ? 10 : 20;






        // Girilen bir sayının onlar basamağının
        // değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = sc.nextInt();

        int onlar=(sayi/10)%10;

        switch (onlar){
            case 0 :
                System.out.println("sıfır");
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            case 3 :
                System.out.println("üç");
                break;
            case 4 :
                System.out.println("dört");
                break;
            case 5 :
                System.out.println("beş");
                break;
            case 6 :
                System.out.println("altı");
                break;
            case 7 :
                System.out.println("yedi");
                break;
            case 8 :
                System.out.println("sekiz");
                break;
            case 9 :
                System.out.println("dokuz");
                break;
            default :
                System.out.println("lütfen en az iki basamaklı birsayı giriniz");


        }




    }
}
