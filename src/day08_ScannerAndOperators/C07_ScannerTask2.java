package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ismninizi giriniz");

        String isim = scanner.nextLine();

        System.out.println("lütfen soyisminizi giriniz");

        String soyIsim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();

        scanner.nextLine(); //nextline öncesinde başka veri sınıfı kullanmışsak
                            // araya boş bir nextline koymamız gerekir

        System.out.println("lütfen doğum yerinizi giriniz");

        String dogumYeri = scanner.nextLine();

        System.out.println("ismniniz: "+isim);
        System.out.println("soyisminiz: "+soyIsim);
        System.out.println("yaşınız: "+yas);
        System.out.println("doğum yeriniz: "+dogumYeri);
        System.out.println("kaydınız başarıyla tamamlanmıştır"); //  \n ile aynı satırda yazabiliriz




    }
}
