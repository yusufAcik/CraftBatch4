package day31_Arrays_1;

import java.util.Scanner;

public class C01_Question_21 {




    // Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın,
    // 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    // Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın.
    // Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile birleştirerek yazdırın.
    // Slm
    // Ali

    // Slm Ali

    public static String kelimeKontrol(){
        Scanner scan=new Scanner(System.in);
        String kelime1="";
        String kelime2="";
        System.out.println("Lütfen 1 ila 4 karakterden oluşan 2 kelime giriniz.");
        int i=0;

        while (true){
        System.out.println("1.Kelime");
        kelime1=scan.nextLine();
        if(kelime1.length()>0 && kelime1.length()<5){
            break;
        }
            System.out.println("Hatalı giriş tekrar deneyiniz.");
            i++;
            if(i==3) return null;
    }
        i=0;
        while (true){
            System.out.println("2.Kelime");
            kelime2=scan.nextLine();
            if(kelime2.length()>0 && kelime2.length()<5){
                break;
            }
            System.out.println("Hatalı giriş tekrar deneyiniz.");
            i++;
            if(i==3) return null; // returnlerde kullanıcıya mesaj verilmez
        }
        return kelime1.concat(" ").concat(kelime2);




    }
    // iki sayının ebob u

    public static int ebob (int x, int y){
        int result=1;
        int min=Math.min(x,y);
        for (int i = 1; i <=min ; i++) {
            if(x%i==0 && y%i==0){
                result=i;
            }
        }
        return result;
    }

    // a*b=ebob(a,b).ekok(a,b)

    public static int ekok (int x,int y){
        return x*y/ebob(x,y);
    }


    public static void main(String[] args) {
      //  System.out.println(kelimeKontrol());

        System.out.println("ebob(8,12) = " + ebob(8, 12));
        System.out.println("ekok(8,12) = " + ekok(8, 12));
    }


}
