package day07_Aritmetic_Operators;

import java.util.Scanner;
//import java.util.*; util paketi içindeki
                        // bütün klasları import eder

public class ScannerExample {

    public static void main(String[] args){

      /*  Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String str=scan.nextLine();
        System.out.println("girdiğiniz kelime "+str+" dır.");
// konsola bu şekilde yazı yazabiliriz. dışarıdan veri girişi


        Scanner scan=new Scanner(System.in);
        System.out.print("kimya ");
        int kimya=scan.nextInt();
        System.out.print("fizik ");
        int fizik=scan.nextInt();

        System.out.println("ortalama "+(fizik+kimya)/2);

        Scanner scan=new Scanner(System.in);
        System.out.print("kimya ");
        int kimya=scan.nextInt();
        System.out.print("fizik ");
        int fizik=scan.nextInt();
        double ortalama=((double)fizik+kimya)/2;
        System.out.println("ortalama "+ortalama);


        Scanner scan=new Scanner(System.in);
        System.out.print("Doğum Yılınız: ");
        int yil=scan.nextInt();
        int yas=2023-yil;
        System.out.print("yas = " +yas);
*/

        Scanner scan=new Scanner(System.in);
        System.out.print("fizik : ");
        int fizik=scan.nextInt();
        System.out.print("kimya : ");
        int kimya=scan.nextInt();
        System.out.print("matematik : ");
        int matematik=scan.nextInt();
        double ortalama=((double)fizik+kimya+matematik)/3;
        System.out.println("ortalama: "+ortalama);





    }

}
