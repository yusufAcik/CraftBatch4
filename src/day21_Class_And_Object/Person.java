package day21_Class_And_Object;

public class Person { // public her yerde kullanılabilir
    // isim cinsiyet yaş -> fields
    // uyu(), oyun oyna() -> methods

    String isim; // değer atamazsak null gelir
    String cinsyet;
    int yas;
    String tcNo;
    boolean a;
    double yilSonuOrtalamasi;

    public void uyu(){
        System.out.println(isim+" uyuyor.");
    }

    public void oyunOyna(){
        System.out.println(isim+" oyun oynuyor.");
    }

    public void tumBilgileriGetir(){
        System.out.println("isim "+isim);
        System.out.println("yaş "+yas);
        System.out.println("cinsiyet: "+cinsyet);
        System.out.println("kimlik numarası: "+tcNo);
    }

    public static String ortalama(double x){
        if(x<50){
            return "c";
        } else if (x<75) {
            return "b";
        }else {
            return "a";
        }
    }
}
