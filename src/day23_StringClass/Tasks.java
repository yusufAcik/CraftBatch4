package day23_StringClass;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesaj giriniz: ");
        String message = scan.nextLine();

      //  System.out.println("numOfChar(message) = " + numOfChar(message));

        System.out.println("------------------------");

        String name = "Yusuf";
        String surName = "Açıkgöz";

        System.out.println(name.length()+surName.length());

        System.out.println("--------------------------");

        System.out.println(name.toUpperCase()+" "+surName.toUpperCase());

        System.out.println("---------------------------");

        System.out.println(message.charAt(message.length()-1));

        System.out.println("----------------------------");

        eachCharInString(message);

        System.out.println("-----------------------------");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("1. Kelime: ");
        String word1= scan1.nextLine();
        System.out.println("2. Kelime: ");
        String word2 = scan1.nextLine();
        System.out.println("3. Kelime: ");
        String word3= scan1.nextLine();

        if (word1.length()>word2.length()&&word1.length()>word3.length()){
            if(word2.length()>word3.length()){
                System.out.println(word1.concat(word2.concat(word3)));
            }else{
                System.out.println(word1.concat(word3.concat(word2)));
            }
        }else if (word2.length()>word3.length()){
            if(word1.length()>word3.length()){
                System.out.println(word2.concat(word1.concat(word3)));
            }else {
                System.out.println(word2.concat(word3.concat(word1)));
            }
        }else {
            if(word1.length()>word2.length()){
                System.out.println(word3.concat(word1.concat(word2)));
            }else {
                System.out.println(word3.concat(word2.concat(word1)));
            }
        }


    }

    public static void eachCharInString (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
