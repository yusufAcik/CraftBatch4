package day13_ForLoops;

import java.util.Scanner;

public class C02_If_Switch_Ternary {

    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin
        // o harfle başlayan gün ismi varsa yazdırın
        // yoksa geçersiz harf yazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0); // scanner sınıfı ile harf alamayız
                                        // scan.next() ile String aldık
                                        // charAt(0) ile bu stringin ilk harfini aldık
                                        // charAt(0) ilk, (1) ikinci vs

        if(harf=='p'|| harf=='P'){
            System.out.println("pazar, pazartesi, perşembe");
        }else if(harf=='s'|| harf=='S'){
            System.out.println("salı");
        }else if(harf=='c'|| harf=='C'){
            System.out.println("carsamba, cuma, cumartesi");
        }else{
            System.out.println("hatalı giriş");

        }

        System.out.println("------------------");

        switch(harf){
            case 's','S':
                System.out.println("sali");
                break;
            case 'c':
            case 'C':
                System.out.println("Carsamba, cuma, Cumartesi");
                break;
            case 'p','P':
                System.out.println("Pazar, Pazartesi, Perşembe");
                break;
            default:
                System.out.println("geçersiz harf");
        }

        System.out.println("-------------------");

        // ternary

        String result = (harf=='p'|| harf=='P')? "pazar, pazartesi, perşembe" : (harf=='s'|| harf=='S')? "salı":
                        (harf=='c'|| harf=='C')? "Carsamba, cuma, Cumartesi" : "geçersiz harf";
        System.out.println(result);




        }



    }

