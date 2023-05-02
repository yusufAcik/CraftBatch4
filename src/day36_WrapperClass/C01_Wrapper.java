package day36_WrapperClass;

import day30_Review.Doktor;

public class C01_Wrapper {

    public static void main(String[] args) {

        int x=5;
        Integer y = new Integer(5);


        System.out.println(x+y);

        System.out.println(x==y);

        char c='a';
        Character cW=new Character('a');
        System.out.println(Integer.max(50, 60));
        System.out.println(Double.min(34.5, 22.2));

        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('*'));
        System.out.println(Character.toLowerCase('A'));

        // wrapper class methodları hayat kurtarır

        Float f=new Float("4.5");
        System.out.println(f);

        Short s=new Short((short) 100);

        Integer sayiW=new Integer(10);
        int sayiP=20;

        sayiP=sayiW; // unboxing
        sayiW=sayiP; // autoboxing



    }
}
