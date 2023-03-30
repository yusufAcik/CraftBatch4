package day08_ScannerAndOperators;

public class C03_AritmeticOperators {

    public static void main(String[] args){

        System.out.println("90"+10);    // 9010 concatenation
        System.out.println(10+"20");    // 1020 concatenation
        System.out.println("90"+10+10);   // 901010 concatenation
        System.out.println("90"+(10+10)); // 9020 concatenation
        System.out.println(10+"90"+30);     // 109030 concatenation
        System.out.println(10+30+"90");     // 4090 concatenation
        System.out.println(""+10+30+"90");   // 103090 concatenation

        System.out.println("----------------------");

        System.out.println(100/33); // 3 integer tam sayı
        System.out.println(10/4); // 2
        System.out.println(10.0/4); // 2.5
        System.out.println(20/6.0); // 3.3333....
        System.out.println(10d/4); // 2.5


    }

}
