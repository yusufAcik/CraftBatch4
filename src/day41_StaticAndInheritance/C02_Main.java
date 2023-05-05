package day41_StaticAndInheritance;



public class C02_Main {
    public static void main(String[] args) {

       Car car5=new Car("honda",112,122,"abc1234",
               true);
       // constructor overloading yaptığımız için istediği veriyi girer
       // Car sınıfını private yaparsak burada obje oluşturamayız

       // car5.setSaseNo("safaf000");
       // System.out.println("car5.getSaseNo() = " + car5.getSaseNo());

        car5.setBeygir(80);
        System.out.println(car5.getBeygir());

        Car car4=new Car("Audi",2022);
        System.out.println("car4.tekerlekSayisi = " + car4.tekerlekSayisi);
        // static variable olduğu için otomatik 4 gelir

        // statik değişkeni değiştirirsek clasın tüm objeleri etkilenir

    }
}
