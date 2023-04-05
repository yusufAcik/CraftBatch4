package day19_Custommethods_Return;

import java.util.Scanner;

public class C09_Tasks2 {
    public static void main(String[] args) {
        System.out.println("digitsOfNumber(349865) = " + digitsOfNumber(349865));
        System.out.println("-----------------");
        System.out.println("mathPow(3,4) = " + mathPow(3, 4));
        System.out.println("-----------------");
        armstrong();
        System.out.println();
        System.out.println("-------------------");
        fibonacci(7);
        System.out.println();
        System.out.println("-------------------");
        System.out.println("ebob(21,28) = " + ebob(21, 28));
        System.out.println();
        System.out.println("--------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Satır sayısı: ");
        int satirSayisi = scan.nextInt();
        yildizUcgeni(satirSayisi);
    }


    // kullanıcıdan alınan sayının kaç basamaklı olduğunu bulalım

    public static int digitsOfNumber(int num){
        int digits=0;
        while (num>0){
            num/=10;
            digits++;
        }
        return digits;
    }

    public static int mathPow(int base, int power){
        int result=1;
        for (int i = 1; i <= power ; i++) {
            result*=base;
        }
        return result;
    }

    public static void armstrong(){
        for (int i =100; i < 1000 ; i++) {
            int birler = i%10;
            int onlar=(i/10)%10;
            int yuzler=i/100;
            int result = birler*birler*birler+onlar*onlar*onlar+yuzler*yuzler*yuzler;
            if (i==result){
                System.out.print(i+" ");
            }
        }

    }

    /**
     * fibonacci dizisi oluşturan method
      * @param n
     */
    public static void fibonacci(int n){
        int a =0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 2; i <= n; i++) {
            int c = b+a;
            System.out.print(c+" ");
           a=b;
           b=c;
        }

    }

    // iki sayının ebob u

    /**
     * iki sayının en büyük ortak bölenini bulan method
     * @param a
     * @param b
     * @return
     */
    public static int ebob(int a, int b){
        int ortakBolen =1;
        for (int i = 1; i <=Math.min(a,b) ; i++) {
            if (a%i==0&&b%i==0){
               ortakBolen=i;
            }
        }
        return ortakBolen;

    }
// Kullanıcıdan satır sayısı alan ve bu satır sayısına göre * (yıldızlar) lardan üçgen oluşturan metodu
//yazınız? yildizUcgeni(3)
//   *
//  * *
// * * *

    public static void yildizUcgeni(int a){

        for (int i = a; i>0 ; i--) {
            int yildiz=a+1;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k =yildiz-i; k > 0 ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
