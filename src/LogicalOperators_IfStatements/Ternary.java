package LogicalOperators_IfStatements;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        int n=60;
        int result=0;
        if(n%2==0){
            //System.out.println(10);
            result=10;
        }else{
           // System.out.println(20);
            result=20;
        }
        System.out.println(result);


        // Ternary Operator
        // (condition) ? (return if True) : (return if false);

        result = (n%2==0) ? 10 : 20;
        System.out.println(result);

        int i=10;
        String result1="";

        result1= (n%2==0) ? "çift" : "tek";
        System.out.println(result1);

        // ternary ile girilen sayı>50 ise 1 değilse 0 yazdıralım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sonuc = 0;

        sonuc = (sayi>50)? 1 : 0;
        System.out.println(sonuc);













    }
}
