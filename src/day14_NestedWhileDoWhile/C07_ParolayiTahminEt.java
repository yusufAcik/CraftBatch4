package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C07_ParolayiTahminEt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String parola = "şafak";
        String tahmin = "";
        int hak=3;
        System.out.println("parolayı tahmin ediniz. 3 hakkınız var");

        while (0<hak){
            tahmin=scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("tebrikler parolayı bildiniz");
                break;
            }else {
                System.out.println("parola yanlış. kalan tahmin hakkınız: "+(--hak));
            }
        }

    }
}
