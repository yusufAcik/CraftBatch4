package day21_Class_And_Object;

public class Main2 {
    public static void main(String[] args) {
        Person cemile=new Person();
        cemile.yas=35;
        cemile.isim="cemile";
        cemile.cinsyet="Kadın";
        cemile.tcNo="1232334342";
        cemile.yilSonuOrtalamasi=45;

        Person cavit=new Person();
        cavit.yas=40;
        cavit.isim="cavit";
        cavit.cinsyet="Erkek";
        cavit.tcNo="342453453535";
        cavit.yilSonuOrtalamasi=80;

        cavit.tumBilgileriGetir();
        cavit.uyu();

        System.out.println(Person.ortalama(cavit.yilSonuOrtalamasi));
    }
}
