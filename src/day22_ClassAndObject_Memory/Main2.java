package day22_ClassAndObject_Memory;

public class Main2 {

    public static void main(String[] args) {
        CarNew car1=new CarNew();
        car1.marka="Audi";
        car1.modelAdi="A4";
        car1.beygir=145;

        CarNew car2=new CarNew();
        car2.marka="Toyota";
        car2.modelAdi="Corolla";
        car2.beygir=143;

        if(car1.beygir>car2.beygir){
            System.out.println(car1.marka+" "+car1.modelAdi);
        }else {
            System.out.println(car2.marka+" "+car2.modelAdi);
        }


        System.out.println(Daire2.alanHesapla2(4));

        System.out.println(car1);

        System.out.println(Math2.pow(3, 4));
    }
}
