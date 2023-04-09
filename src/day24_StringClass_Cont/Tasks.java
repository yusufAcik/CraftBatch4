package day24_StringClass_Cont;

public class Tasks {
    public static void main(String[] args) {
        String userName="";
        String password="";

        System.out.println("userNamePasswordKontrol(userName,password) = " + userNamePasswordKontrol(userName, password));

        System.out.println("-------------------------");

        String metin= "Javayı seviyor muyum?";
        String sayisiIstenenKarakter="y";

        System.out.println("seciliKarakterSayisi(metin,sayisiIstenenKarakter) = " + seciliKarakterSayisi(metin, sayisiIstenenKarakter));

        System.out.println("------------------------------------");

        // Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın

        String str="javayı seviyor muyum";
        String result="";
        if(str.contains("a")) result="a";
        if(str.contains("e")) result+=", e";
        if(str.contains("ı")) result+=", ı";
        if(str.contains("i")) result+=", i";
        if(str.contains("o")) result+=", o";
        if(str.contains("ö")) result+=", ö";
        if(str.contains("u")) result+=", u";
        if(str.contains("ü")) result+=", ü";

            System.out.println(result);

        System.out.println("------------------------------");

        // Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
        //isteyin cümle içinde sev köküne sahip bir kelime var ise bir
        //method what a lovely person(ne hoş bir insan) mesajı
        //döndürsün

        String cumle="Bugün çocuk bayramı, bütün çocuklar çok sevinçli.";

        System.out.println("lovelyPerson(cumle) = " + lovelyPerson(cumle));

        System.out.println("-------------------------");

        String isim="yusuf";
        son3X3(isim);

    }
    // Kullanıcıdan userName ve password isteyen bir method
    //yazın. Method aşağıdaki şartları kontrol etsin.
    //Password ve username alanı boş olamaz.
    //Password alanı boş olamaz
    //Password 8 karakterden az olamaz.
    //Username 3 karakterden az olamaz. (ödev)
    public static String userNamePasswordKontrol (String userName, String password){
        String result="";
        if(userName.isEmpty()||password.isEmpty()){
            result="Username ve password boş olamaz!";
        }else if(userName.length()<3||password.length()<8){
            result="Username 3 karakterden; password 8 karakterden az olamaz!";
        }else{
            result="Username ve password başarılı.";
        }
        return result;


    }

    // "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren
    //bir program yazın.

    public static int seciliKarakterSayisi(String metin,String sayisiIstenenKarakter){
       return  (metin.length())-(metin.replace(sayisiIstenenKarakter,"").length());
    }

    public static String lovelyPerson(String str){
        String str1="";
        if(str.contains("sev")) str1="what a lovely person";
            return str1;
    }

    // İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.

    public static void son3X3 (String isim){

        for (int i = 0; i < 3; i++) {

            System.out.println(isim.substring(isim.length() - 3));

        }
    }



}
