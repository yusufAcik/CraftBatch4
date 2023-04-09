package day25_Summary;

public class C01_Methods {
    public static void main(String[] args) {

        // kullanıcıdan veri almak için main içinde scanner
        // sınıfı kullanmak yerine main dışında method oluşturup
        // o methodda işlenecek verileri girmek gerekli

        System.out.println("sonDeger(\"merhaba\") = " + sonDeger("merhaba")); // char
        System.out.println("sonDeger2(\"merhaba\") = " + sonDeger2("merhaba")); // char
        System.out.println("sonDeger3(\"merhaba\") = " + sonDeger3("merhaba")); // String
        int x=5;
        int y=10;
        ornekMethod(x,y);




    }

    public static void ornekMethod(int x, int y) {

        System.out.println(x+y); // void methodlarda sadece sonucu
                                // ekrana yazdırabiliriz başka yerde kullanamayız


    }
    public static int ornekMethod2(int x, int y){
        int z=x+y;
        return z;
    }
    public static char sonDeger (String str){
        char result='a';
        for (int i = 0; i <str.length() ; i++) {
            result=str.charAt(i);
        }
        return result;
    }

    public static char sonDeger2 (String str){
        return str.charAt(str.length()-1);
    }

    public static String sonDeger3 (String str){
        return str.substring(str.length()-1);
    }
}
