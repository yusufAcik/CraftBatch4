package day25_Summary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class String_Example3 {

    public static void main(String[] args) {
        String kelime1="Merhaba";
        String kelime2="Merhab";
        System.out.println("kelimeKarsilastir(kelime1,kelime2) = " + kelimeKarsilastir(kelime1, kelime2));

        System.out.println("kelimeKarsilastir2(kelime1,kelime2) = " + kelimeKarsilastir2(kelime1, kelime2));

        Scanner scan = new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("1. Kelime: ");
            String str1=scan.nextLine();
            System.out.println("2. Kelime: ");
            String str2=scan.nextLine();
            flag=!kelimeKarsilastir2(str1,str2);
        }
    }

    public static String kelimeKarsilastir(String kelime1,String kelime2){
       String result="";
        if(kelime1.equals(kelime2)){
            result="girdiğiniz kelimeler aynı";
        }else if (kelime1.length()==kelime2.length()){
            result="girdiğiniz kelimelerin karakter sayıları eşit";
        } else{
            result="girdiğiniz kelimeler ve karakter sayıları eşit değil";
        }
        return result;
    }

    public static boolean kelimeKarsilastir2(String kelime1,String kelime2){

        if(kelime1.equalsIgnoreCase(kelime2)){
            System.out.println("girdiğiniz kelimeler aynı");
            return true;
        }else if (kelime1.length()==kelime2.length()){
            System.out.println("girdiğiniz kelimelerin karakter sayıları eşit");
            return true;
        } else{
            System.out.println("girdiğiniz kelimeler ve karakter sayıları eşit değil");
            return false;
        }

    }

}



// Bir
//method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
//eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
//sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
//kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
//ise kullanıcıyı aynı sürece sokun
