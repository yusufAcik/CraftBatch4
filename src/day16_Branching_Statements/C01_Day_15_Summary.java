package day16_Branching_Statements;

import java.util.Scanner;

public class C01_Day_15_Summary {

    public static void main(String[] args) {

      /*  int taban = 4;
        int kuvvet = 4;

        int result=1;
        for (int i=0; i < kuvvet ; i++){
            result*=taban;
        }
        if (taban==0&&kuvvet==0){
            System.out.println("tanımsız");
        }else{
            System.out.println(result);
        }



        //     *
        //    * *
        //   * * *      
        //  * * * *
        // * * * * *

        for (int i = 1; i <= 5; i++) {
            for (int j = (6-i); j>=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 6-i; k <=5 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // kullanıcıdan 2 sayı alın. toplamı 25 ten küçükse
        // loop devam etsin. değilse döngüden çıksın

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("x: ");
            int x = scan.nextInt();
            System.out.print("y: ");
            int y = scan.nextInt();
            int result = x+y;
            if (result>=25){
                flag=false;
                System.out.println("toplam 25 ten büyük. çıkış.");
            }else{
                System.out.println("toplam: "+result);
            }
        }

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("x: ");
            int x = scan.nextInt();
            System.out.print("y: ");
            int y = scan.nextInt();
            int result = x+y;
            if (result>=25){
                System.out.println("toplam 25 ten büyük. çıkış.");
                break;

            }
                System.out.println("toplam: "+result);

        }
*/
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("x: ");
            int x = scan.nextInt();
            System.out.print("y: ");
            int y = scan.nextInt();
            int result = x+y;
            if (x==0&&y==0){
                break;
            }
            if (result>=25){
                System.out.println("toplam 25 ve dah büyük olduğu için tekrar deneyiniz.");
                continue;
            }
            System.out.println("toplam: "+result);

        }
        System.out.println("program sonlandı.");

    }
}
