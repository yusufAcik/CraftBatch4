package day25_Summary;

public class String_Example {


    public static void main(String[] args) {
        String cumle="Merhaba dünya";
        String cumle2=" nasılsın";
        String cumle3="r";
        String kelime4="   merhaba   ";
        String kelime5= "merhaba dünyalı";
        String kelime6=" mer   haba   ";
        String kelime7="aba";
        String kelime8="aba";
        String kelime9="Aba";
        String str=" ";
        String str1="A";
        String str2="ba";


        System.out.println("uzunlulk(cumle) = " + uzunlulk(cumle));

        System.out.println("harfleriKucult(cumle) = " + harfleriKucult(cumle));

        System.out.println("harfleriBuyut(cumle) = " + harfleriBuyut(cumle));

        System.out.println("karakterGetir(cumle,6) = " + karakterGetir(cumle, 6));

        System.out.println("birlestir(cumle,cumle2) = " + birlestir(cumle, cumle2));

        System.out.println("cumle.contains(cumle3) = " + cumle.contains(cumle3));

        System.out.println("iceriyorMu(cumle,cumle3) = " + iceriyorMu(cumle, cumle3));

        System.out.println("bosluklarıSil(kelime4) = " + bosluklarıSil(kelime4));

        System.out.println("kelime5.replace(\"mer\",\"Har\") = " + kelime5.replace("mer", "Har"));

        System.out.println("kelimeDegistir(kelime5,\"mer\",\"Har\") = " + kelimeDegistir(kelime5, "mer", "Har"));

        System.out.println("kelimeDegistir(kelime6,\" \",\"\") = " + kelimeDegistir(kelime6, " ", ""));

        System.out.println("ilkKelimeDegistir(kelime7,\"a\",\"i\") = " + ilkKelimeDegistir(kelime7, "a", "i"));

        System.out.println("kelime5.indexOf(\"er\") = " + kelime5.indexOf("er"));
        System.out.println("ilkIndexNoGetir(kelime5,\"er\") = " + ilkIndexNoGetir(kelime5, "er"));

        System.out.println("cumle.lastIndexOf(\"a\") = " + cumle.lastIndexOf("a"));
        System.out.println("sonIndexNoGetir(cumle,\"a\") = " + sonIndexNoGetir(cumle, "a"));

        System.out.println("kelime7.equals(kelime8) = " + kelime7.equals(kelime8));
        System.out.println("esitMi(kelime7,kelime8) = " + esitMi(kelime7, kelime8));

        System.out.println("kelime8.equalsIgnoreCase(kelime9) = " + kelime8.equalsIgnoreCase(kelime9));
        System.out.println("esitMiBuyukKucukIhmalEt(kelime8,kelime9) = " + esitMiBuyukKucukIhmalEt(kelime8, kelime9));

        System.out.println("str.isEmpty() = " + str.isEmpty());

        System.out.println("str.isBlank() = " + str.isBlank());

        System.out.println("kelime9.startsWith(str1) = " + kelime9.startsWith(str1));
        System.out.println("bununlaBasliyorMu(kelime9,str1) = " + bununlaBasliyorMu(kelime9, str1));

        System.out.println("kelime9.endsWith(str2) = " + kelime9.endsWith(str2));
        System.out.println("bitiyorMu(kelime9,str2) = " + bitiyorMu(kelime9, str2));

        System.out.println("indextenItibarenYaz(kelime9,1,2) = " + indextenItibarenYaz(kelime9, 1, 2));

        System.out.println("cumle.substring(2,6) = " + cumle.substring(2, 6));

        System.out.println("indextenItibarenYaz(cumle,2,6) = " + indextenItibarenYaz(cumle, 2, 6));
    }

    // girilen bir Stringin uzunluğunu döndüren method

    public static int uzunlulk(String str){
        return str.length();
    }

    // toLowerCase()

    public static String harfleriKucult(String str){
        return str.toLowerCase();
    }

    // toUpperCase()
    public static String harfleriBuyut(String str){
        return str.toUpperCase();
    }

    // charAt()

    public static char karakterGetir(String str, int index){
        return str.charAt(index);
    }

    // concat()

    public static String birlestir(String a, String b){
        return a.concat(b);
    }

    // contains()

    public static boolean iceriyorMu(String str, String kontrolEdilecekKelime){
        return str.contains(kontrolEdilecekKelime);
    }

    // contains() i indexOf() ile yeniden yapalım
    public static boolean iceriyorMu2(String str,String kontrolEdilecekKelime){
        if(str.indexOf(kontrolEdilecekKelime)<0){
            return false;
        } else return true;
    }

    // trim()   stringin baş ve sonundaki boşlukları siler

    public static String bosluklarıSil(String str){

        return str.trim();
    }

    // replace() benim verdiğim değer ile değiştir

    public static String kelimeDegistir(String str,String eskiKelime, String yeniKelime ){
        return str.replace(eskiKelime,yeniKelime);
    }

    // replaceFirst()   sadece ilk gördüğü parçayı değiştirir

    public static String ilkKelimeDegistir(String str,String eskiKelime, String yeniKelime){
        return str.replaceFirst(eskiKelime,yeniKelime);
    }

    // indexOf()  int döndürür

    public static int ilkIndexNoGetir(String str,String kelime){
        return str.indexOf(kelime);
    }

    // lastIndexOf()

    public static int sonIndexNoGetir(String str, char kelime){
        return str.lastIndexOf(kelime);
    }
    public static int sonIndexNoGetir(String str, String kelime){
        return str.lastIndexOf(kelime);
    }

    // equals()

    public static boolean esitMi(String a, String b){
        return a.equals(b);
    }

    // equalsIgnoreCase()

    public static boolean esitMiBuyukKucukIhmalEt(String a, String b){
        return a.equalsIgnoreCase(b);
    }

    // == referansları kontrol eder

    // isEmpty()

    public static boolean bosMu(String str){
        return str.isEmpty();
        // str.length()==0 isEmpty in alternatifi
    }

    // isBlank()

    public static boolean karakterVarMi(String str){
        return str.isBlank();
       // str.replace(" ","")==0; isBlank alternatif
    }

    // startsWith()
    public static boolean bununlaBasliyorMu(String kelime, String kontrolEdilecekKelime){
        return kelime.startsWith(kontrolEdilecekKelime);
    }

    // endsWith()

    public static boolean bitiyorMu(String kelime, String kontrolEdilecekKelime){
        return kelime.endsWith(kontrolEdilecekKelime);
    }

    // substring(int beginIndex)
    // substring(int beginIndex, int endIndex)

    public static String indextenItibarenYaz(String str,int index){
        return str.substring(index);
    }

    public static String indextenItibarenYaz(String str,int startIndex, int endIndex){
        return str.substring(startIndex,endIndex);
    }
}
