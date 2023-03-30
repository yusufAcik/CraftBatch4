package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {

    public static void main(String[] args) {

      /*  int aliFizik = 50;
        int aliKimya = 60;
        double ortalama = (aliKimya+aliFizik)/2;
        boolean isPass = (ortalama>=50);
        // if(ortalama>50);
        // double gecmeNotu = 50;
        // if(ort>gecmeNotu)
        if(isPass){

            System.out.println("Ali sınıfı geçti.");
        }
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Fizik: ");
        double f = scan.nextDouble();
        System.out.println("Kimya: ");
        double k = scan.nextDouble();
        System.out.println("Geçme Notu: ");
        double gecmeNotu = scan.nextDouble();
        double ort=(f+k)/2;

        if (ort>=gecmeNotu){
            System.out.println("Sınıfı Geçtiniz Tebrikler.");

        }



    }
}
