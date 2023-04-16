package day26_String_Lab;

public class String_Lab {
    public static void main(String[] args) {

        String str="Jo";
        String str2="   merhaba    arkadaşlar     ";
        String str3= "arkadaşlar";
        String str4="   yusuf merhaba nasılsın    ";

        System.out.println(ilkUcHarf(str));

        System.out.println("--------------------");

        System.out.println(yuzdeEkle(str2));

        System.out.println("-------------------");

        System.out.println(ikinciYari(str3));

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

}

