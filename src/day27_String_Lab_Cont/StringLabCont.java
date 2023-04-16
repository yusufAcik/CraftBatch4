package day27_String_Lab_Cont;

public class StringLabCont {
    public static void main(String[] args) {

        String str = "Kinlenmek";
        String str2 = "Ekin ektim";
        String str3 = "Keskin ilçesinden geçiyorum";
        String target = "kin";
        String isim1 = "Mehmet";
        String isim2 = "Mustafa";

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


}
