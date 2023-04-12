package day24_StringClass_Cont;

public class Tasks2 {

    public static void main(String[] args) {

        String isim="yusuf";
        String soyIsim="Açıkgöz";

        String kelime1="yaşamak";
        String kelime2="güzel";

        System.out.println("ortadakiUcHarf(isim) = " + ortadakiUcHarf(isim));

        System.out.println("----------------------------");

        System.out.println("isimSoyisimEsitle(isim,soyIsim) = " + isimSoyisimEsitle(isim, soyIsim));

        System.out.println("----------------------------");

        System.out.println("soyIsimDuzenle(isim,soyIsim) = " + soyIsimDuzenle(isim, soyIsim));

        System.out.println("nickNameOlustur(isim,soyIsim) = " + nickNameOlustur(isim, soyIsim));

        System.out.println("------------------------------");

        System.out.println("kelimeBirlestir(kelime1,kelime2) = " + kelimeBirlestir(kelime1, kelime2));

        System.out.println("--------------------------------");

        System.out.println("terstenYaz(isim) = " + terstenYaz(isim));

        System.out.println("-------------------------------");

        String cumle="Dün akşam eve giderken onları görmüştüm.";
        char harf='ü';

        System.out.println(cumle.lastIndexOf('ş'));
        System.out.println(cumle.charAt(12));

        System.out.println("----------------------------");

        System.out.println(harfOnuArkasi(cumle, 'ü'));


        //  System.out.println("cumle.substring(cumle.indexOf(harf),cumle.indexOf(harf+2)) = " + cumle.substring(cumle.indexOf(harf)-1,cumle.indexOf(harf)).concat(cumle.substring(cumle.indexOf(harf)+1)));


    }

    // 1-İsminizin ortadaki 3 harfini veren bir method yazın.

    public static String ortadakiUcHarf (String str){
      return  str.substring(str.length()/2-1,str.length()/2+2);
    }

    // 2-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
    //kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
    //birleştirin.

    public static String isimSoyisimEsitle (String isim,String soyIsim){
       String birlesim="";
        if(isim.length()>soyIsim.length()){
           birlesim= isim.substring(0,soyIsim.length()).concat(soyIsim);
        } else if (soyIsim.length()>isim.length()) {
          birlesim=  isim.concat(soyIsim.substring(0,isim.length()));
        }else {
          birlesim=  isim.concat(soyIsim);
        }
        return birlesim;
    }

    // 3-İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
    //baş harfinden arındırıp yazdıran bir method oluşturun.

    public static String soyIsimDuzenle (String isim, String soyIsim){

        return soyIsim.replace(isim.substring(0,1),"");
    }

    // 4-İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
    //oluşturan bir method yazın.

    public static String nickNameOlustur (String isim, String soyIsim){
        return isim.substring(0,3).concat(soyIsim.substring(soyIsim.length()-3));
    }

   // 5-Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna
   // ekleyen bir method yazın.

    public static String kelimeBirlestir (String kelime1, String kelime2){
        String str="";
        if(kelime1.length()<kelime2.length()){
            str=kelime1.concat(kelime2.concat(kelime1));
        }else {
            str=kelime2.concat(kelime1.concat(kelime2));
        }
        return str;
    }

    // 6-Girilen kelimeyi tersten yazdıran bir method yazın.

    public static String terstenYaz (String str){
        String reversed=" ";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    // 7-Dün akşam eve giderken onları görmüştüm. Cümlesindeki ü
    //harfinin önünde ve arkasında olan harflerden bir string üreten
    //bir method yazın.

   public static String harfOnuArkasi (String cumle,char harf){
        String result="";

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==harf){
            result+=cumle.substring(i-1,i).concat(cumle.substring(i+1,i+2));
            }
       }return result;
   }

}


