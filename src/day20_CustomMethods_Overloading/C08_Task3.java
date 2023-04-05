package day20_CustomMethods_Overloading;

import java.util.Scanner;

public class C08_Task3 {

    public static void main(String[] args) {
        System.out.println(sayiAl());
    }

    public static int sayiAl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayı: ");
        int sayi1= scan.nextInt();
        System.out.println("2. sayı: ");
        int sayi2= scan.nextInt();

        return sayilariTopla(sayi1,ucunKatiMi(sayi2));
    }

    private static int ucunKatiMi(int sayi2) {
        if(sayi2%3==0) return sayi2;
        else return (sayi2-(sayi2%3));
    }

    private static int sayilariTopla(int x, int y) {
        return (x+y);
    }

}

/* Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
başka bir metodtan geçirin ve 3. katı olacak şekilde size
döndürsün. Sonra bu sayıları kabul eden başka bir
metotla da sayıları toplayın.
*/