package day25_Summary;

public class C01_Main {

    public static void main(String[] args) {

        int f=10;
        int c=40;
        System.out.println("Math2.max(f,c) = " + Math2.max(f, c));

        int g=4;
        int v=5;
        System.out.println("Math2.pow(g,v) = " + Math2.pow(g, v));

        if(Math2.pow(g,v)>500){
            System.out.println("500 den büyük");
        }

        Math2 a=new Math2();
        a.deger=5;
        Math2 b=new Math2();
        b.deger=6;

        System.out.println("a.multiple(a.deger,b.deger) = " + a.multiple(a.deger, b.deger));


    }



}
