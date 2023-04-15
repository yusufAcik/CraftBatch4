package day28_Java_Quiz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_02_CodingAnswers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime bir de harf giriniz");
        String str=scan.nextLine();
        String ch=scan.nextLine();
        System.out.println(str+" da "+frequency(str,ch)+" adet "+ch+" bulunmaktadır.");
    }


    public static int frequency(String str, String ch){
        return str.length()-str.replace(ch,"").length();
    }
}
