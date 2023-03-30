package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_If {

    public static void main(String[] args) {

        // kullanıcının yaşını kontrol edip
        // 18 yaşından küçükse ikaz ver
        // 18 ve üzeri ise yanında bayan var mı diye sor
        // bayan yoksa giremezsin

        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınız: ");
        int yas=scan.nextInt();

     /*   if(yas>=18){
            System.out.println("Hoş Geldiniz");
        }else{
            System.out.println("Giremezsiniz");
        }
        */
        if(yas>=18){
            System.out.println("Yanınızda bayan var mı?(Evet ya da Hayır giriniz)");
            String yanit = scan.next();
            if(yanit.equals("Evet")){
                System.out.println("Yüzme biliyor musunuz?(Evet/Hayır):");
                String yanit2=scan.next();
                if(yanit2.equals("Evet")){
                    System.out.println("Hoş Geldiniz");
                }else{
                    System.out.println("Yüzme bilmeyenler giremez.");
                }
            }else {
                System.out.println("yanınızda bayan olmadığı için giremezsiniz");
            }
        }else{
            System.out.println("Giremezsiniz");
        }

    }
}
