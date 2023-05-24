package day56_JavaReview;

public class C02_WrapperClass {

    public static void main(String[] args) {

        int a=99;
        byte b=33;
        a=b;
        b=(byte) a;

        Integer c = a;
        // c=b;
        // Wrapper class uses its own datatype

        char ch='%';
        Character ch1=ch;

        System.out.println("--------------------");

        String str="12345";

        int i = Integer.parseInt(str); // int  // int e atar
        System.out.println("i = " + i);

        Integer j = Integer.valueOf(str); // Integer  // wrapper class Integer a atar
        System.out.println("j = " + j);

        System.out.println("Integer.max(9,5) = " + Integer.max(9, 5));
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Character.isAlphabetic('5') = " + Character.isAlphabetic('5'));
        System.out.println("Character.isLetterOrDigit('%') = " + Character.isLetterOrDigit('%'));

    }


}
