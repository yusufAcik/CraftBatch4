package day56_JavaReview;

import java.util.Scanner;

public class C04_ReverseString {

    // kullanıcıdan string isteyip tersini döndürün

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("tersini istediğiniz metni giriniz: ");
        String str = scan.nextLine();
        System.out.println("reverseString4(str) = " + reverseString4(str) );


    }

    public static String reverseString(String str){
        String reverse="";
        for (int i = str.length()-1; 0<=i ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static String reverseString1 (String str){
        String reverse="";
        for (int i = str.length()-1; 0<=i ; i--) {
            reverse+=str.substring(i,i+1);
        }
        return reverse;
    }

    public static String reverseString2 (String str){
        String reverse="";
        while (str.length()!=0){
            reverse+=str.substring(str.length()-1);
            str=str.substring(0,str.length()-1);
        }
        return reverse;
    }

    public static String reverseString3 (String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static String reverseString4 (String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

}
