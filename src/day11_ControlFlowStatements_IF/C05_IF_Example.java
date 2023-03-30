package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C05_IF_Example {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("fizik: ");
        double f = scan.nextDouble();
        System.out.println("kimya: ");
        double k = scan.nextDouble();
        System.out.println("matematik: ");
        double m = scan.nextDouble();
        System.out.println("Geçme Notu: ");
        double gecmeNotu = scan.nextDouble();
        double ort = (f+k+m)/3;

        if (ort>gecmeNotu){
            System.out.println("Geçtiniz.");
        }
        else{
            System.out.println("Kaldınız");
        }
    }
}
