package day27_String_Lab_Cont;

import java.util.Scanner;
public class Odev {

    public class StringLabTask {
        public static void main(String[] args) {

            String str = "Kinlenmek";
            String str2 = "Ekin ektim";
            String str3 = "Keskin ilçesinden geçiyorum";
            String target = "kin";
            String isim1 = "Mehmet";
            String isim2 = "Mustafa";

            String str5="Jo";
            String str6="   merhaba    arkadaşlar     ";
            String str7= "arkadaşlar";
            String str4="   yusuf merhaba nasılsın    ";

            System.out.println(ilkUcHarf(str5));

            System.out.println("--------------------");

            System.out.println(yuzdeEkle(str6));

            System.out.println("-------------------");

            System.out.println(ikinciYari(str7));

            System.out.println("------------------------");

            System.out.println(ilkHarfDegistir("merhaba", "a", "e"));

            System.out.println("---------------------");

            System.out.println(ilkHarfDegistir2("merhabaer", "er", "is"));

            System.out.println("-------------------");

            System.out.println(trim2(str4));

            System.out.println("-----------------------");

            System.out.println(herHarfx3(str3));

            System.out.println("-----------------");

            System.out.println(herHarfIstediginKadar("yusuf", 5));

            System.out.println("------------------");

            System.out.println(subString2(str3, 4));

            System.out.println("----------------------");

            System.out.println(subString2(str4, 5, 12));

            System.out.println("----------------");

            System.out.println(karakterSayisiBul(str4, 'a'));

            System.out.println("--------------------");

            System.out.println(karakterSayisiBulIgnoreCase("AnkarA", 'a'));
            System.out.println(karakterSayisiBul2("Ankara", "a"));
            System.out.println(karakterSayisiBul3("Ankara", "a"));

            System.out.println("-----------------------");

            System.out.println(harfEksilt("Ankara", 'a'));
            System.out.println(harfEksilt2("yusuf", 'u'));


            System.out.println(kelimeKontrol(str, target));
            System.out.println(kelimeKontrol(str2, target));
            System.out.println(kelimeKontrol(str3, target));

            System.out.println("-------------------");

            System.out.println(kelimeKontrol2(str, target));
            System.out.println(kelimeKontrol2(str2, target));
            System.out.println(kelimeKontrol2(str3, target));

            System.out.println("------------------------");

            System.out.println(kelimeKontrol3(str, target));
            System.out.println(kelimeKontrol3(str2, target));
            System.out.println(kelimeKontrol3(str3, target));
            System.out.println(ilkKelimeKontrol(str3, target));

            System.out.println("------------------------");

            System.out.println(kelimeYazdir(isim1, isim2,2,3));

            System.out.println("----------------------");

            System.out.println(noktaIleTamamla(isim1, 11,'.'));
            System.out.println(karakterTamamla(isim2, 23, '&'));

            System.out.println("-------------------------");

            System.out.println(bastakiHarflerSondaVarMi("saSa", 2));

            System.out.println("------------------");

            System.out.println(soyIsimYaz("   Harun Kenan Can  "));
            System.out.println(soyIsimYaz2(" Harun Kenan Can  "));
            System.out.println(soyIsimYaz3(" Harun Kenan Can  "));

            System.out.println("---------------------------");

            System.out.println(harfEksilt("Ananas"));
            System.out.println(harfEksilt2("Ananas"));


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

        // Soru 1. girilen stringin ilk 3 harfini döndüren method

        public static String ilkUcHarf (String str){
            if (str.length()>=3){
                str=str.substring(0,3);
            }else str=str;
            return str;
        }

        // Soru 2 girilen her boşluğa % ibaresi ekleyin

        public static String yuzdeEkle (String str){
            return str.replace(" ","%");
        }

        // Soru 3 kullanıcının girdiği eşit uzunluktaki bir
        // kelimenin 2. yarısını döndüren method

        public static String ikinciYari (String str){
            if (str.length()%2==0){
                return str.substring(str.length()/2);
            }else
                return str.substring(str.length()/2+1);
        }

        public static String ikinciYariAlternatif (String str){
            return str.substring( (int) Math.ceil((double)str.length()/2));
        }
        // Math.ceil double değeri en yakın üst
        // int değere eşit double değere tamamlar (4.5 i 5.0 a gibi)

        // Soru 4 kullanıcıdan bir kelime ile değiştirmek istediği harfi/harfleri
        // alan ve ilk gördüğü harfi değiştiren method
        // (Merhaba  a,e)->Merheba  gibi

        public static String ilkHarfDegistir (String kelime, String ilkharf,String sonHarf){
            return kelime.substring(0,kelime.indexOf(ilkharf)).concat(sonHarf).concat(kelime.substring(kelime.indexOf(ilkharf)+1));
        }

        public static String ilkHarfDegistir2 (String kelime, String eski, String yeni){
            return kelime.replaceFirst(eski,yeni);
        }

        // trim() alternatifi
        // "   yusuf merhaba nasılsın    "
        // "yusuf merhaba nasılsın"
        // start -> y , end -> n
        // str.substring(start, end)

        public static String trim2 (String str){
            int start=0;
            int end=0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)!=' '){
                    start=i;
                    break;
                }
            }
            for (int i = str.length()-1; i >=0 ; i--) {
                if(str.charAt(i)!=' '){
                    end=i;
                    break;
                }
            }
            return str.substring(start,end+1);

        }

        // Soru 5 kullanıcıdan bir kelime alın ve her harfi 3 er defa yazdırın

        public static String herHarfx3(String str){
            String result="";
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < 3; j++) {
                    result+=str.charAt(i);
                }

            }
            return result;
        }

        public static String herHarfIstediginKadar(String str,int adet){
            String result="";
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < adet; j++) {
                    result+=str.charAt(i);
                }

            }
            return result;
        }

        // tek index numarası alan subString Methodu

        public static String subString2 (String str, int index){
            String result="";
            for (int i = index; i <str.length() ; i++) {
                result+=str.charAt(i);
            }
            return result;
        }

        // çift index numarası alan subString methodu (overloading)

        public static String subString2 (String str,int ilkIndex, int sonIndex){
            String result="";
            for (int i = ilkIndex; i <sonIndex ; i++) {
                result+=str.charAt(i);
            }
            return result;
        }

        // Soru 6 kullanıcıdan bir kelime ve bir karakter alıp
        // o karakterin kelimede kaç tane olduğunu bulalım
        // büyük küçük harf göz ardı edilecek
        // Ankara, a ->3; Edirne, e -> 2

        public static int karakterSayisiBul (String str, char karakter){
            int karakterAdet=0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==karakter){
                    karakterAdet++;
                }
            }
            return karakterAdet;
        }

        public static int karakterSayisiBulIgnoreCase (String str, char karakter){
            String x=karakter+"";   // char ı stringe çevirme
            int karakterAdet=0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i,i+1).equalsIgnoreCase(x)){
                    karakterAdet++;
                }
            }
            return karakterAdet;
        }

        // basit ignoreCase
        public static int karakterSayisiBul2 (String str, String karakter){
            str=str.toLowerCase();
            karakter=karakter.toLowerCase();
            int karakterAdet=0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i,i+1).equals(karakter)){
                    karakterAdet++;
                }
            }
            return karakterAdet;
        }

        public static int karakterSayisiBul3 (String str, String karakter){
            str=str.toLowerCase();
            karakter=karakter.toLowerCase();
            int startLength=str.length();
            int finalLength=str.replace(karakter,"").length();

            return startLength-finalLength;
        }

        // Soru 7 bir kelime ve bir harf alın; kelimeyi harflerden
        // arındırılmış şekilde yazın

        public static String harfEksilt (String str, char harf){
            String son="";
            String harf1=harf+"";
            return str.replace(harf1,"");
        }

        // replace kullanmadan harfEksilt

        public static String harfEksilt2 (String str, char target){
            String result="";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)!=target){
                    result+=str.charAt(i);
                }
            }
            return result;
        }

        //Soru 8 Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
        //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
        //Kinlenmek true
        //Kin tutmak true
        //Ekin ektim true
        //Keskin ilçesinden geçiyorum false
        //Neden kin tutuyorsun false

        public static boolean kelimeKontrol(String str, String target) {
            if (str.substring(0, 3).equalsIgnoreCase(target)) {
                return true;
            } else if (str.substring(1, 4).equalsIgnoreCase(target)) {
                return true;
            } else return false;
        }

        // startWith ile
        public static boolean kelimeKontrol2(String str, String target) {
            str = str.toLowerCase();
            target = target.toLowerCase();
            if (str.startsWith(target)) {
                return true;
            } else if (str.substring(1).startsWith(target)) {
                return true;
            } else return false;
        }

        public static boolean kelimeKontrol3(String str, String target) {
            str = str.toLowerCase();
            target = target.toLowerCase();
            return str.startsWith(target) || str.substring(1).startsWith(target);
        }
        // kelime kontrol alternatif

        public static boolean ilkKelimeKontrol (String str, String target){
            str = str.toLowerCase();
            target = target.toLowerCase();
            return str.substring(0,target.length()+1).contains(target);
        }

        // Soru 9 Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
        //defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
        //Mehmet
        //Ali
        //AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        //hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        //hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        //hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        //hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        //hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        //hmetAliAli

        public static String kelimeYazdir(String str1, String str2,int ilkSonDongu,int ortaDongu) {
            String result = "";
            if (str1.length() < str2.length()) {
                for (int i = 0; i < ilkSonDongu; i++) {
                    result += str1;
                }
                for (int i = 0; i < ortaDongu; i++) {
                    result += str2;
                }
                for (int i = 0; i < ilkSonDongu; i++) {
                    result += str1;
                }
            } else {
                for (int i = 0; i < ilkSonDongu; i++) {
                    result += str2;
                }
                for (int i = 0; i < ortaDongu; i++) {
                    result += str1;
                }
                for (int i = 0; i < ilkSonDongu; i++) {
                    result += str2;
                }

            }
            return result;

        }

        // Soru 10 Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
        //altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
        //Sabun Sabun
        //Merhaba Merha
        //Ali Ali..
        //Hey Hey..
        //Pi Pi...

        public static String noktaIleTamamla (String str, int karakterSayisi,char tamamlayan){
            String result="";
            if (str.length()>=karakterSayisi){
                result=str.substring(0,karakterSayisi);
            }else {
                result=str;
                for (int i = 0; i < karakterSayisi-str.length(); i++) {
                    //int i=str.length ; i<karakterSayisi; i++
                    result+='.';
                }
            }
            return result;
        }
        // alternatif

        public static String karakterTamamla (String str,int number,char karakter){
            if(str.length()>=number){
                return str.substring(0,number);
            }
            for (int i = str.length(); i < number ; i++) {
                str+=karakter;
            }
            return str;
        }
        // Soru 11 Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
        //almıyorsa false yazdırın.
        //Ankara false
        //Kafka true
        //Salsa true
        //Saksı false

        public static boolean bastakiHarflerSondaVarMi (String str, int number){
            if(str==null||str.length()<number||number<1) return false;
            return str.substring(0,number).equalsIgnoreCase(str.substring(str.length()-number));
        }

        // Soru 12 Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
        //Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
        //İnput: "Harun Özsoy "
        //Output: "Soy isminiz Özsoy dır."
        //İnput:" Harun Kenan Özsoy "
        //Output: "Soy isminiz Özsoy dır."
        //İnput: "Harun Kenan Can Özsoy "
        //Output: "Soy isminiz Özsoy dır."
        //İnput:" Harun Kenan Can Sami Özsoy"
        //Output: "Soy isminiz Özsoy dır."
        //Soru 12
        //Kullanıcı başına ve sonuna dilediği kadar boşluk girebilir lütfen
        //bu durumu dikkate alın. Output’u dikkatli inceleyin.

        public static String soyIsimYaz (String str){
            int start=0;
            int end=0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)!=' '){
                    start=i;
                    break;
                }
            }
            for (int i = str.length()-1; i >=0; i--) {
                if (str.charAt(i)!=' '){
                    end=i;
                    break;
                }
            }
            str=str.substring(start,end+1);
            int soyIsimBasHarf=0;
            for (int i = str.length()-1; i >=0 ; i--) {
                if (str.charAt(i)==' '){
                    soyIsimBasHarf=i+1;
                    break;
                }
            }
            return "soy isminiz: "+str.substring(soyIsimBasHarf);
        }
        // hazır trim ile
        public static String soyIsimYaz2 (String str){
            str=str.trim();
            int soyIsimBasKarakter=0;
            for (int i = str.length()-1; i >=0 ; i--) {
                if(str.charAt(i)==' '){
                    soyIsimBasKarakter=i+1;
                    break;
                }
            }
            return "soy isminiz: "+str.substring(soyIsimBasKarakter);
        }

        public static String soyIsimYaz3 (String str){
            if (str==null){
                return null;
            }
            str=str.trim();
            return"soy isminiz: "+str.substring(str.lastIndexOf(" ")+1);
        }

        // Soru 13 Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
        //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
        //Merhaba Merhab
        //Ananas Anas

        public static String harfEksilt (String str) {
            String result="";

            for (int i = 0; i < str.length(); i++) {

                if (!result.contains(str.substring(i,i+1))){
                    result+=str.substring(i,i+1);
                }
            }
            return result;
        }

        public static String harfEksilt2 (String str) {
            String result="";
            for (; str.length()>0;){
                if (!result.contains(str.substring(0,1))){
                    result+=str.substring(0,1);
                }
                str=str.replace(str.substring(0,1),"");
            }
            return result;
        }


        //Soru 14 Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
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
}
