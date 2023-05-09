package day43_InheritanceAndAccessKeywords;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Banka.karsilama();  // method statik olduğu için obje oluşturmadan geldi
        Banka banka1=new Banka();
        banka1.bankName="Akbank";
        banka1.genelMerkezAdresi="Ankara Yenimahalle";
        banka1.genelMerkezTel="03121231221";

        Musteri musteri=new Musteri("Ali Veli",false);
        musteri.subeAdi="Ulus";
        musteri.isPersonel=false;
        musteri.musteriAdSoyadi="ali veli";

        Sube sube=new Sube();
        sube.subeKodu=123000;

        musteri.menu();






        // ödev para ekle çıkar menü oluştur
        // kullanıcıya seçenekler sunalım




    }
}
