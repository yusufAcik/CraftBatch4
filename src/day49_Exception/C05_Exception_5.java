package day49_Exception;

import java.util.Scanner;

public class C05_Exception_5 {

    private static int count=0; // sayiGir() için kullanılmıştır
    // sadece bu class tan görülür
    public static void main(String[] args) {

        // loop kullanmadan 3 haklı sayı girme

        sayiGir();


     /*   Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz: ");
        try {
            int x=scan.nextInt();
            scan.nextLine();
        }catch (Exception e){
            System.out.println("Hatalı giriş tekrar deneyiniz");
            Scanner scan1 = new Scanner(System.in);
            System.out.println("bir tam sayı giriniz: ");
            }try {
                int y=scan.nextInt();
            scan.nextLine();
            }catch (Exception f){
                System.out.println("Hatalı giriş tekrar deneyiniz");
                System.out.println("bir tam sayı giriniz: ");
            }try {
        int z=scan.nextInt();
            scan.nextLine();
    }
        catch (Exception g){
            System.out.println("Hatalı giriş sistemden çıkılıyor");
            System.exit(0);
        }

*/
    }

    public static int sayiGir(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("sayi:");
            int x=scan.nextInt();
            count=0; // sistemden çıkmadan count u sıfırladık(tekrar kullanabilmek için)
            return x;
        }catch (Exception e){
            count++;
        }if(count==3){
            System.out.println("hakkınız kalmamıştır");
            count=0; // sistemden çıkmadan count u sıfırladık(tekrar kullanabilmek için)
            System.exit(0);
        }
        System.out.println(3-count+" hakkınız kalmıştır. tekrar deneyiniz");
        return sayiGir();
    }


}
