package day12_SwitchCase;

import java.util.Scanner;

public class C05_Example {

    public static void main(String[] args) {
        // öğrencinin ortalamasını alın
        // zayıf<50<=orta<70<=iyi<85<=pekiyi
        // 85 ve üzeri alanlar 95 ve üzerini kontrol ve onur belgesi

        Scanner scan = new Scanner(System.in);
        System.out.println("Ortalama giriniz: ");
        double ort = scan.nextDouble();
        if (ort<50){
            System.out.println("Zayıf");
        }else if (ort<70){
            System.out.println("orta");
        }else if (ort<85){
            System.out.println("iyi");
        }else{
            System.out.println("pekiyi");
            if (ort>=95){
                System.out.println("onur belgesi almaya hak kazandınız");
            }
        }
    }
}
