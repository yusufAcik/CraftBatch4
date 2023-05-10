package day43_InheritanceAndAccessKeywords;

import java.util.Scanner;

public class Musteri extends Sube{

    String musteriAdSoyadi;
    int tlHesapNo;
    double bakiye;
    boolean isPersonel;

    public Musteri(String musteriAdSoyadi,boolean isPersonel){
        this.musteriAdSoyadi=musteriAdSoyadi;
        this.isPersonel=isPersonel;
    }

    public double getBakiye() {
        return bakiye;
    }

    public boolean isPersonel() {
        return isPersonel;
    }

    public void paraEkle(double para){
        bakiye+=para;
    }

    public void paraCek(double para){
        bakiye-=para;
    }

    public void menu(){
        System.out.println("isim soy isim giriniz");
        Scanner scan = new Scanner(System.in);
        if(scan.nextLine().equalsIgnoreCase(musteriAdSoyadi)){
            System.out.println("İşlem Seçiniz.(1.Para Ekle, 2. Para Çek, 3. Bakiye Gör, 4. Çıkış)");
        int tercih=scan.nextInt();
        switch (tercih){
            case 1:
                System.out.println("miktar giriniz");
                paraEkle(scan.nextDouble());
                System.out.println("işlem başarılı"+" bakiyeniz = "+getBakiye());
                break;
            case 2:
                System.out.println("miktar giriniz");
                paraCek(scan.nextDouble());
                System.out.println("işlem başarılı"+" bakiyeniz = "+getBakiye());
                break;
            case 3:
                getBakiye();
                break;
            case 4:
                System.out.println("Güvenli Çıkış Yapıldı");
                break;
            default:
                System.out.println("Hatalı giriş");
                break;
        }

    }
}}
