package mentoring08_methodsReview;

import java.util.Scanner;

public class OrtalamaTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("öğrenci ismi, fizik, kimya ve matematik notu giriniz: ");
        Ogrenci ogr1 = new Ogrenci();
        ogr1.isim=scan.nextLine();
        ogr1.fizik=scan.nextInt();
        ogr1.kimya=scan.nextInt();
        ogr1.matematik=scan.nextInt();

        System.out.println(ogr1.isim+" not ortalaması "+Ogrenci.ortalamaBul(ogr1.isim, ogr1.fizik, ogr1.kimya, ogr1.matematik));


    }


    //isim ve fizik kimya matematik notlaı alsın 2 ayrı method ile
    //ve ahmet in not ortalaması 70 şeklinde döndürsün
}
