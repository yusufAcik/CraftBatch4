package day30_Review;

public class C06_Hastane {
    public static void main(String[] args) {
        Doktor hekim1=new Doktor();  // instance değişkenlere ancak obje oluşuturularak erişilebilir.
        System.out.println(hekim1.cinsiyet);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);
        System.out.println("---------------------");
        hekim1.isim="Kaan";
        hekim1.soyIsim="Sarp";
        hekim1.uzmanMi=true;
        hekim1.yas=32;
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);
        System.out.println(Doktor.fakulte); // static değişkene class ismi ile erişilebilir
        Doktor.fakulte="Hacettepe Tıp Fakültesi";

        System.out.println(hekim1); // referansını yazar

        System.out.println("-------------------");

        Doktor hekim2=new Doktor();
        hekim2.isim="Buket";
        System.out.println(hekim2.isim);
        System.out.println(Doktor.fakulte); // Hacettepe tıp fakültesi yazar

    }
}
