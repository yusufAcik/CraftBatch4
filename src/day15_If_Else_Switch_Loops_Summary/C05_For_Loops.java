package day15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C05_For_Loops {

    public static void main(String[] args) {

     //   for (int i=0; i<5; i++){
       //     System.out.println("Merhaba");

        // çalışma prensibi i ye değer atar,
        // şartı kontrol eder içeri girer,
        // i yi değiştirir, şartı kontrol eder
        // içeri girer, i yi artırır, şartı kontrol eder,
        // içeri girer ....

        // i++ zorunlu değil - sonsuz döngü olur

     /*   for ( ; ; ){
        }            döngü için bu ögeler yeterli
                     sonsuz döngü



        for (int i=0,k=5; i<3; i++,k+=5){
            System.out.println(k);
        }  // istediğimiz kadar değişken tanımlayabiliriz

        for (int i=0, k=5; (i<3&&k<25);i++,k+=5){
            System.out.println(i);
        }
*/
        Scanner scan = new Scanner(System.in);
        int sifre=56;
        System.out.println("şifre nedir 3 hakkınız var");
        boolean result =true;
        int i=0;
        while (result){
            System.out.println("şifre: ");
            int tahmin= scan.nextInt();
            if(sifre==tahmin){
                System.out.println("şifre doğru");
                result=false;
            }else{
                System.out.println("şifre yanlış");
                i++;
            }
            if(i==3){
                result=false;
            }
        }

}
    }



