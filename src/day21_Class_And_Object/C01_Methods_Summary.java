package day21_Class_And_Object;

import java.util.Random;

public class C01_Methods_Summary {

    public static void main(String[] args) {
    int a=max(5,10)*10;
        System.out.println(a);
        System.out.println();
        System.out.println("--------");
        String str = yaziTura();
        System.out.println(str);
    }

    public static int max(int x,int y){
        int max;
        if (x>y){
            max=x;
        }else {
            max=y;
        }
        return max;
    }

    public static String yaziTura(){
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        if (x%2==0){
            return "tura";
        }
        return "yazı";
    }
}
