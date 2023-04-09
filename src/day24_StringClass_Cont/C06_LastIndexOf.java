package day24_StringClass_Cont;

import java.sql.SQLOutput;

public class C06_LastIndexOf {

    public static void main(String[] args) {

        // indexOf() ilk bulunan indeksi getirir
        // lastIndexOf() son bulunan indeksi getirir
        //          0123456
        String str="Merhaba";
        System.out.println(str.indexOf("a")); // 4
        System.out.println(str.lastIndexOf("a")); // 6
        System.out.println("-------------------");
        int length=str.length(); // 7
        System.out.println("length = " + length);
        int lengthFinal=str.replace("a","").length();
        System.out.println("lengthFinal = " + lengthFinal);
        System.out.println(str+" içerisinde "+(length-lengthFinal)+" adet a harfi mevcuttur.");

    }
}
