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

        int i = Integer.parseInt(str); // int
        System.out.println("i = " + i);

        Integer j = Integer.valueOf(str); // Integer
        System.out.println("j = " + j);


    }


}
