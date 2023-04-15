package day28_Java_Quiz;

public class C01_Java_Quiz {

    public static void main(String[] args) {

        System.out.println(toplam(6));

        System.out.println("-----------------");

        vkiSonuc(vki(87,186));

        System.out.println("-------------------");

        kacTaneVar("merhaba arkadaşlar",'a');

        System.out.println("--------------------");

        System.out.println(faktoriyel(4));

        System.out.println("---------------------");

        System.out.println(concatt("aa", "bb"));
        System.out.println(concatt("aa", "bb", "cc"));

        System.out.println("----------------------");

        System.out.println(isPolindrome("kabakçı"));

        System.out.println("--------------------");

        System.out.println(ayniMi("Ayna", "ayna"));

    }
    //1.d,2.b,3.a,4.f,5.a,6.c,7.d,8.b,9.d,10.b,



    // başlama 21:10  1.d, 2.b, 3.a, 4.b doğru cevap f, 5.a, 6.c, 7.c doğru cevap d,
    // 8.a cevap b, 9.d, 10.d doğru cevap b,

    //  1-)Kullanıcının girdiği sayısal bir ifadeyi alan ve 1den başlayarak girilen sayı
    //dahil toplamını veren metodu yazınız.

    public static int toplam (int sayi) {
        int result=0;
        for (int i = 0; i <=sayi ; i++) {
            result+=i;
        }
        return result;
    }

    // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
    //Aldiginiz degerleri bir metoda gondererek hesaplatin
    //vucutKitleEndeksiHesapla(kilo,boy)
    // vucut kitle endeksi = (kilo*10000 / (boy *boy))
    // vucut kitle endeksi
    // 30’dan buyukse obez,
    // 25-30 arasi ise kilolu,
    // 20-25 arasi ise normal,
    // 20’den kucukse zayif yazdirin.

    public static double vki (double kilo, double boy){
        double result=0;
        result=kilo*10000/(boy*boy);
        return result;
    }

    public static void vkiSonuc (double vki){
        if (vki>30) System.out.println("obez");
        else if (vki>25) System.out.println("kilolu");
        else if (vki>20) System.out.println("normal");
        else System.out.println("zayıf");
    }

    // 3-) Kullanicidan bir String bir de char deger alin. Stringin icinde kac tane char
    //oldugunu donen bir metodla sayiyi hesaplatin. Stringde kac adet o harften
    //oldugunu da asagidaki formatta ekrana yazdirin.
    // İpucu: length(),frequency(String str,char ch)
    //orn:input “Merhaba”, ‘a’ Output= Merhaba ‘da 2 adet a bulunmaktadir.

    public static void kacTaneVar (String str, char ch){
        int result=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==ch){
                result++;
            }
        }
        System.out.println(str+" içinde "+result+" adet "+ch+" vardır.");

    }
    // 4- Girilen sayının faktoriyelini döndüren bir metot yazınız.

    public static int faktoriyel (int sayi){
        int result=1;
        for (int i = 1; i <=sayi ; i++) {
            result*=i;
        }
        return result;
    }

    // 5-Concat işlemi yapan 2 adet ve 3 adet değer alacak iki farklı overloading metot
    //yazınız.

    public static String concatt (String str, String str2){
        return str+str2;
    }

    public static String concatt (String str, String str2, String str3){
        return str+str2+str3;
    }

    // 6.Girilen kelimenin polindrom olup olmadığını kontrol eden bir metot yazınız.
    //(Tersi kendisine eşit)

    public static boolean isPolindrome (String str){
        boolean sonuc=false;
        String result="";
        for (int i = str.length()-1; i>=0; i--) {
            result+=str.charAt(i);
            if (result.equalsIgnoreCase(str)) return true;
        }
        return sonuc;
        // ternary ile return str.equals(result) ? true : false;
    }

    //  7.equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
    //büyükküçük harfleri baz almadan kontrol eden bir metot yazınız.

    public static boolean ayniMi (String str, String str2){
        return str.toLowerCase().equals(str2.toLowerCase());
    }
}


