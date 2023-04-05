package day21_Class_And_Object;

public class Person { // public her yerde kullanılabilir
    // isim cinsiyet yaş -> fields
    // uyu(), oyun oyna() -> methods

    String isim;
    String cinsyet;
    int yas;
    String tcNo;

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
}
