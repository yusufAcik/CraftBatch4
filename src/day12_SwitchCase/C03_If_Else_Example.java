package day12_SwitchCase;

import java.util.Scanner;

public class C03_If_Else_Example {

    public static void main(String[] args) {

        // 4 işlem yapan hesap makinesi
        // sayıları ve yapmak istediği işlemi kullanıcıdan al
        // hatalı işlem girişlerinde kullanıcıyı uyar

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        double a = scan.nextDouble();
        System.out.println("bir sayı daha giriniz:");
        double b = scan.nextDouble();
        System.out.println("yapmak istediğiniz işlemi giriniz(ör: +,-,*,/):");
        String islem = scan.next();
       // if (islem==+) stringlerde == kullanılmaz
            if (islem.equals("+")){
            System.out.println(a+b);
        }else if (islem.equals("-")){
                System.out.println(a-b);
            }else if (islem.equals("*")) {
                System.out.println(a*b);
            }   else if (islem.equals("/")){
                System.out.println(a/b);
            }else {
                System.out.println("hatalı işlem");
            }



    }
}
