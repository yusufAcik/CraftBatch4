package day13_ForLoops;

public class C06_Tasks {

    public static void main(String[] args) {
        // 0-100 arası sayıları yazdır

        for (int i = 0; i <= 100; i++) {
            System.out.println(i); //  print(i+" ") dersek yan yana yazdırır
        }

        System.out.println("-----------------");
        // 15-100 yan yana

        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");
        // 0-100 tersten

        for (int i = 100; 0 <= i; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        // 0-100 çift sayılar

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println("----------------");

        // ya da
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");

        // 0-100 tek sayılar

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");
        // 1-100 sayıların toplamı
        // düzeltme ctrl+alt+l

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum=sum+i
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("----------------");

        // 1-20 küplerini yazdır

        for (int i=1; i<=20; i++){
            System.out.println(i+" "+i*i*i);
        }

        System.out.println();
        System.out.println("----------------");

        // 23-50 C arası tüm fahrenheit değerlerini yazdır
        // F=1,8C+32

        for(int c=23; c<=50; c++){
            System.out.println(c+" derece "+c*1.8+32+" fahrenheit tır ");
        }
        System.out.println();
        System.out.println("----------------");

        // a dan z ye kadar harfleri yazdırın
        // karakterlerde de artırma azaltma yapabiliriz
        // asci kodları sıralıdır

        for(char ch='a'; ch<='z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("----------------");

        // 9 sayısının çarpım tablosunu yazınız

        for(int i=1; i<=10; i++){
            System.out.println("9 * "+i+" = "+9*i);
        }



    }


}
