package day27_String_Lab_Cont;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        System.out.println(yinelenenHarfler(" Derslerime cok calisiyorum"));

        System.out.println("-------------------");

        unluUnsuzHarfler("Ankara");

        System.out.println("-------------------");

        System.out.println(ilkHarflerSona("Merhaba", 3));

        System.out.println("----------------------");

        System.out.println(sonHarflerBasa("Merhaba", 5));

        System.out.println("----------------------");

        System.out.println(ilkBenzersizHarf("aaasssgG"));

        System.out.println("-----------------");

        System.out.println(isAnagram("iftar", "tarif"));
        System.out.println(isAnagram2("Zehra", "Ezhar"));

        System.out.println("---------------------");

        System.out.println(ardArdaHarfler("Arsız"));

        System.out.println("--------------------------");

       // System.out.println(girilenKelimeleriBirlestir());

        System.out.println("----------------------");

        System.out.println(isPalindrome("Kasaba"));

        System.out.println("---------------------");

        System.out.println(kacAdetVar(" Sev seni seveni , sevmek güzeldir.", "sev"));

        System.out.println("-------------------------");

        System.out.println(ikiKelimeKarsilastir("Ankara Bursa kadar yeşil değil. Bursa bir başka. ankara", "Ankara", "Bursa"));

        System.out.println("----------------------------");

        System.out.println(ileBitiyorMu("aca", "acak"));

        System.out.println("--------------------------");

        System.out.println(harfSayilariBasa("Seni seviyorum"));

        System.out.println("--------------------");

        System.out.println(enCokTekrarEdenHarf("eeemmmsssssssssshhhhhhhhhssseeeeeeeeeeeeee"));

    }

    //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
    //olarak return eden methot yazınız.
    //" Java " output:a
    //" Javva " output:av
    //" Derslerime cok calisiyorum" output:erslimco
    //Boşluk ları almamak ve boş string için kullanıcıya farklı bir
    //cevap döndürmek bonus.


    public static String yinelenenHarfler(String str) {
        str = str.replace(" ", "");
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i + 1).contains(str.substring(i, i + 1))) {
                result += str.charAt(i);
                str = str.replace(str.charAt(i), ' ');

            }

        }
        return result.replace(" ", "");
    }

    // Soru 15 Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.
    //Ankara ünlü harfler=Aa
    //Ünsüz harfler=nkr

    public static void unluUnsuzHarfler(String str) {
        String unluler = "";
        String unsuzler = "";
        String unluHarfler = "AEIİOÖUÜaeıioöuü";
        for (int i = 0; i < str.length(); i++) {
            if (unluHarfler.contains(str.substring(i, i + 1))) {
                unluler += str.charAt(i);
            } else {
                unsuzler += str.charAt(i);
            }
        }
        System.out.println(unluler);
        System.out.println(unsuzler);
    }

    // Soru 16 Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer
    //Ali Ali

    public static String ilkHarflerSona(String str, int yerDegHarfSayisi) {
        if (str.length() < yerDegHarfSayisi) return "daha uzun bir kelime giriniz";
        return str.replaceFirst(str.substring(0, yerDegHarfSayisi), "").concat(str.substring(0, yerDegHarfSayisi));
    }

    // Soru 17 Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin.
    //Merhaba abaMerh
    //Ali Ali

    public static String sonHarflerBasa(String str, int yerDegHarfSayisi) {
        if (str.length() < yerDegHarfSayisi) return "daha uzun bir kelime giriniz";
        return str.substring(str.length() - yerDegHarfSayisi).concat(str.replace(str.substring(str.length() - yerDegHarfSayisi), ""));
    }
    //Soru 18
    //Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    //küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    //ikazı versin.
    //Merhaba M
    //Araba r
    //Karkas rotası o

    public static String ilkBenzersizHarf(String str) {
        str = str.toLowerCase().replace(" ","");
        String ilkBenzersizHarf = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str.replaceFirst(str.charAt(i)+"","").contains(str.charAt(i) + "")) {
                ilkBenzersizHarf = str.charAt(i)+"";
                break;
            }else {
                ilkBenzersizHarf="Benzersiz harf bulunamadı.";
            }
        }
        return ilkBenzersizHarf;
    }
    // Soru 19 Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //yazdırın. (anagram kelime ise)
    //İftar – Tarif true
    //Zehra – Ezhar true
    //Nefes – Enfes true
    //Selcuk-Elyase false

    public static boolean isAnagram (String str1, String str2){
        boolean result=false;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()) result=false;

        for (int i = 0; i <str1.length(); i++) {

            if (str2.contains(str1.charAt(i)+"")){

                str2=str2.replaceFirst(str1.charAt(i)+"","");
            }
        }
        if(str2.isEmpty()) result=true;
        else result=false;

        return result;
    }

    public static boolean isAnagram2 (String str1, String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()) return false;

        for (int i = 0; i <str1.length(); i++) {
            int index=str2.indexOf(str1.charAt(i));

            if(index==-1) return false;

            str2=str2.substring(0,index)+(str2.substring(index+1));
        }
        return true;
    }
    //Soru 20
    // Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
    //yazın.
    //aabccccseeeeeefff acef
    //abaccb c
    //Arsız ardı ardına tekrar eden harf yoktur
    //amannsız n

    public static String ardArdaHarfler (String str){
        String ardArdaHarfler="";
        str=str.trim().toLowerCase().replace(" ","");
        for (int i=0 ; i<str.length()-1 ; i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                ardArdaHarfler+=str.charAt(i);
                str=str.replace(str.charAt(i)+"","");
            }
        }
        if (ardArdaHarfler.equals("")) {ardArdaHarfler="Ardı ardına tekrar eden harf bulunamadı";}
        return ardArdaHarfler;
    }
    //Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    //girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    //Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    //giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
    //birleştirerek yazdırın.
    //Slm
    //Ali
    //Slm Ali

    public static String girilenKelimeleriBirlestir (){
        String result="";
        String str="";
        String str1="";

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Kelimeyi giriniz(En az 1 en fazla 4 karakter)");
        int hak1=3;
        for (int i =hak1; i >0; i--) {

            String giris1=scan.nextLine();
            if (1<=giris1.length()&&giris1.length()<=4){
                str=giris1;
                break;
            }else {
                System.out.println("Hatalı giriş. Kalan hakkınız "+(--hak1));

            }
        }

        if (hak1>0) {
        System.out.println("2. Kelimeyi giriniz(En az 1 en fazla 4 karakter)");
        int hak2=3;
        for (int i =hak2; i >0; i--) {

            String giris2=scan.nextLine();
            if (1<=giris2.length()&&giris2.length()<=4){
                str1=giris2;
                break;
            }else {
                System.out.println("Hatalı giriş. Kalan hakkınız "+(--hak2));
            }
        }}
        if(str.length()>0&&str1.length()>0) result=str+" ".concat(str1);
        else result="girilen kelimeler hatalı, tekrar deneyiniz.";
        return result;
    }

    // Soru 22 -> Soru 18 ile aynı

    //Soru 23 24
    // Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    //true değil ise false döndüren metot yazınız.
    //Kabak true
    //Nalan true
    //Ara true
    //talat true
    //Kasaba false
    //ahmet false

    public static boolean isPalindrome (String str){
        boolean result=false;
        str=str.toLowerCase().trim();
        String str2="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str2+=str.charAt(i);
        }
        if (str.equals(str2)) result=true;
        return result;
    }
    //Soru 25
    // Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
    //ekrana yazdırın.
    //Seni seviyorum 1
    //Sevmek veya sevmemek 2
    //Sev seni seveni , sevmek güzeldir. 3

    public static int kacAdetVar (String str, String arananKelime){
        str=str.toLowerCase();
        arananKelime=arananKelime.toLowerCase();
        int sonuc=0;

        while (str.contains(arananKelime)){
            str=str.replaceFirst(arananKelime,"");
            sonuc++;

        }
        return sonuc;
    }
    //Soru 26
    // Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
    //sayılarda dönüyorsa false yazdıran metodu yazınız.
    //Ankara ile Bursa arası 500 km. True
    //Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //İstanbul çok uzak false


    public static boolean ikiKelimeKarsilastir (String cumle, String kelime1, String kelime2){
        boolean result=false;
        int kelime1Num=0;
        int kelime2Num=0;
        cumle=cumle.toLowerCase();
        kelime1=kelime1.toLowerCase();
        kelime2=kelime2.toLowerCase();

        while (cumle.contains(kelime1)){
            cumle=cumle.replaceFirst(kelime1,"");
            kelime1Num++;
        }
        while (cumle.contains(kelime2)){
            cumle=cumle.replaceFirst(kelime2,"");
            kelime2Num++;
        }
        if (kelime2Num==kelime1Num && kelime1Num!=0) result=true;
        else result=false;

        return result;
    }
    //Soru 27
    // Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    //döndüren metodu yazdırın.
    //Kullanacak true
    //Zamlanacak true
    //Farkındalık false
    //Farkında false

    public static boolean ileBitiyorMu (String str, String kontrol){
        boolean sonuc = false;

        if(str.length()<kontrol.length()) sonuc=false;
        else {
            if (str.substring((str.length() - (kontrol.length()))).equals(kontrol)) {
                sonuc = true;
            }
        }

        return sonuc;
    }
    //Soru 28
    // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
    //yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
    //Merhaba 1m1e1r1h2a1b
    //Seni seviyorum 2s2e1n2i1v1y1o1r1u1m

    public static String harfSayilariBasa(String str){
        String result="";
        str=str.toLowerCase().replace(" ","");


    while (str.length()>0) {
            String ch=str.charAt(0)+"";
            int finalLength=str.length()-str.replace(ch,"").length();
            result+=""+finalLength+ch;
            str=str.replace(ch,"");
}
        return result;
    }

    // Soru 29
    // Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    //Merhaba a
    //aaaaaaabbcccc a
    //eeemmmsssssssssshhhhhhhhhsss s

    public static char enCokTekrarEdenHarf(String str){
        char result=str.charAt(0);
        int chCount=0;
        int araCount=0;
        while (str.length()>0){
            char ch=str.charAt(0);
            chCount=str.length()-str.replace(ch+"","").length();
            if(chCount>araCount) {
                result=ch;}
            str=str.replace(ch,' ').replace(" ","");
            if (chCount>araCount) araCount=chCount;
        }
        return result;
    }
}

