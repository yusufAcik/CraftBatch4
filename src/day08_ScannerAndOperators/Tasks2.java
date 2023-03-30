package day08_ScannerAndOperators;


import java.util.Scanner;

public class Tasks2 {

    public static void main(String[] args){


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen yarıçap giriniz: ");

        double r =scan.nextDouble();
        double PI=3.14;
        double cevre=2*PI*r;
        double alan=PI*r*r;

        System.out.println(r+" cm yarıçaplı dairenin çevresi: "+cevre+" alanı "+alan+" cmdir.");




    }

}
