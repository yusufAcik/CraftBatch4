package day53_ExceptionAndCollection_Summary;

public class Insan implements Baba,Ogretmen{
    @Override
    public void ogutVer() {
        System.out.println("iyi arkadaşlar edin");
    }

    @Override
    public void harclikVer() {
        System.out.println("harçlık verildi");
    }

    @Override
    public void egitim() {
        System.out.println("java eğitimi verir");
    }

    @Override
    public void sinayYap() {
        System.out.println("quiz yapar");
    }

    public void yemekYe(){
        System.out.println("yemek yiyor");
    }

    public void uyu(){
        System.out.println("uyuyor");
    }
}
