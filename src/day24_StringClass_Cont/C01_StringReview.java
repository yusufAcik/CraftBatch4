package day24_StringClass_Cont;

import java.util.Scanner;

public class C01_StringReview {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim = scan.nextLine();
        // Yavuz Selim
        // kullanıcının isminin son harfini alalım
        // length(), charAt(),
        int uzunluk= isim.length();
        char sonHarf = isim.charAt(uzunluk-1);

        System.out.println(sonHarf);

        // equals()

        System.out.println(isim == " Yavuz Selim ");   // false - referanslar farklı
        System.out.println(isim.equals(" Yavuz Selim ")); // true
        System.out.println(isim.equalsIgnoreCase(" yaVuZ SelİM ")); // true

        // toUpperCase(), toLowerCase(),

        System.out.println(isim.toUpperCase());
        System.out.println(isim.toLowerCase());

        // trim()

        System.out.println(isim.trim());
        System.out.println(isim);

        // indexOf()

        System.out.println(isim.indexOf("S"));
        System.out.println(isim.indexOf("Selim"));
        System.out.println(isim.indexOf(" "));
        System.out.println(isim.lastIndexOf(" "));

        int ilkIndeks = isim.indexOf("Y");
        int sonIndeks = isim.lastIndexOf("Y");
        if(ilkIndeks==sonIndeks){
            System.out.println(" Y stringde unique tir");
        }else{
            System.out.println(" Y stringde unique değildir.");
        }

        // replace()

        System.out.println(isim.replace(" ",""));
        System.out.println(isim.replace("vuz","gız"));

        String message = "Merhaba";
        System.out.println(message.replace('a','e'));
        System.out.println(message.replaceFirst("a","e"));
    }
}
