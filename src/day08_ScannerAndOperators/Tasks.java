package day08_ScannerAndOperators;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args){

    int toplam = 5*2+4+3-2*(1+2)+3;
        System.out.println("toplam = " + toplam);

        int toplam2 = 1-2*(2+4)/2*(-2-1);

        System.out.println("toplam2: "+toplam2);

        int num1=20;
        int num2=30;
        int num3=40;
        int sum=(num1+num2+num3);
        System.out.println("" +num1+ "+" +num2+ "+" +num3+ "=" +sum);

        Scanner kmScan= new Scanner(System.in);

        System.out.println("lütfen km giriniz: ");

        double km= kmScan.nextDouble();
        double mil=km*0.625;

        System.out.println(km+" kilometre "+mil+" mil yapar.");







    }

}
