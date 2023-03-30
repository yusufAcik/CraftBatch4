package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C06_If_Else_Example {

    public static void main(String[] args) {

      /*  System.out.println("A");
        if(false){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
        System.out.println("D");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz: ");
        double temp = scan.nextDouble();
        if(temp<20){
            System.out.println("Hava soğuk");
        }else{
            System.out.println("Hava sıcak");
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int num = scan.nextInt();
        boolean result = (num%2==0);
        if(result){
            System.out.println("girdiğiniz sayı çifttir");
        }else{
            System.out.println("girdiğiniz sayı tektir");
        }
    }
}
