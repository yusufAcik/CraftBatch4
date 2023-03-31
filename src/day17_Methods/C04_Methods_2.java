package day17_Methods;

import java.util.Scanner;

public class C04_Methods_2 {

    public static void main(String[] args) {

        aritmetikOrtalama();
        System.out.println("-----------------");
        max(5,6);
        System.out.println("-------------------");
        okka();
        System.out.println("-----------");
        int sayi= 5;
        kupHesaplama(sayi); // parantez içine istediğimiz kadar
                            // değişken tanımlayabiliriz arada , ile
        System.out.println("-----------------");
        int a = 22;
        kareHesaplama(a);
        System.out.println("-----------");
        isimYaz("yusuf");
        System.out.println("-----------------");
        ort(55,77);
    }/**
    * metodun açıklamasını buraya yazabiliriz
    */
    public static void aritmetikOrtalama(){
        double x=3, y=5, z=10;
        double result = (x+y+z)/3;
        System.out.println("ortalama: "+result);
    }

    public static void max(int x,int y){

        int max;
        if(x>y){
            max = x;
        }else {
            max =y;
        }

        System.out.println("buyuk sayı: "+max);
}
    // kiloyu okka cinsinden veren program okka = 1.282 kg


    public static void okka(){

        Scanner scan = new Scanner(System.in);
        System.out.println("kilogram girin: ");
        double okka = scan.nextDouble();
        double kg = okka/1.282;
        System.out.println(okka+" okka "+kg+" kg'dır.");

}


        public static void kupHesaplama(int x){
        int result=x*x*x;
            System.out.println("sonuç: "+result);
        }


        // sayının karesini yazan metod

        public static void kareHesaplama(int x){
        int result = x*x;
            System.out.println("sonuç: "+result);
        }

        // parametre olarak isminizi alan ve sonucunda
        // isminizi yazan program

        public static void isimYaz(String name){
            System.out.println("isminiz: "+name);
        }

        // iki sayının ortalamasını veren program

        public static void ort (double x, double y){
            System.out.println(x+" ve "+y+" ortalaması : "+((x+y)/2));
        }

}
