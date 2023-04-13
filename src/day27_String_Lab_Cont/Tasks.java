package day27_String_Lab_Cont;

public class Tasks {
    public static void main(String[] args) {

        System.out.println(yinelenenHarfler(" Derslerime cok calisiyorum"));

        System.out.println("-------------------");

        unluUnsuzHarfler("Ankara");

        System.out.println("-------------------");

        System.out.println(ilkHarflerSona("Merhaba", 3));

        System.out.println("----------------------");

        System.out.println(sonHarflerBasa("Merhaba", 5));


    }

    //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
    //olarak return eden methot yazınız.
    //" Java " output:a
    //" Javva " output:av
    //" Derslerime cok calisiyorum" output:erslimco
    //Boşluk ları almamak ve boş string için kullanıcıya farklı bir
    //cevap döndürmek bonus.


    public static String yinelenenHarfler (String str){
        str=str.replace(" ","");
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i+1).contains(str.substring(i,i+1))){
                result+=str.charAt(i);
                str=str.replace(str.charAt(i),' ');

            }

        }
        return result.replace(" ","");
    }

    // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.
    //Ankara ünlü harfler=Aa
    //Ünsüz harfler=nkr

    public static void unluUnsuzHarfler (String str){
        String unluler="";
        String unsuzler="";
        String unluHarfler="AEIİOÖUÜaeıioöuü";
        for (int i = 0; i < str.length(); i++) {
            if (unluHarfler.contains(str.substring(i,i+1))){
                unluler+=str.charAt(i);
            }else {
                unsuzler+=str.charAt(i);
            }
        }
        System.out.println(unluler);
        System.out.println(unsuzler);
    }

    // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer
    //Ali Ali

    public static String ilkHarflerSona (String str, int yerDegHarfSayisi){
        if (str.length()<yerDegHarfSayisi) return "daha uzun bir kelime giriniz";
        return str.replaceFirst(str.substring(0,yerDegHarfSayisi),"").concat(str.substring(0,yerDegHarfSayisi));
    }

    // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin.
    //Merhaba abaMerh
    //Ali Ali

    public static String sonHarflerBasa (String str, int yerDegHarfSayisi){
        if (str.length()<yerDegHarfSayisi) return "daha uzun bir kelime giriniz";
        return str.substring(str.length()-yerDegHarfSayisi).concat(str.replace(str.substring(str.length()-yerDegHarfSayisi),""));
    }


}
