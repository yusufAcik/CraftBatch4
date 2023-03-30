package day06_Type_Casting;

public class TypeCasting {

    public static void main(String[] args){

        // byte, short, int, float, double, long
        // char
        // boolean

       /* byte b=5;
        short s=b;

        System.out.println(s);

        widening casting küçük data tipinden
         büyük data tipine otomatik olur


        byte b=5;
        short s=12;
        b=(byte)s;

        System.out.print(b);
        Narrowing casting büyük data tipinden
        küçük data tipine elle olur

        int i=10;
        double d=20;
        i= (int) d;

        float f=2.5f;
        i= (int) f;

        System.out.print(i);

        String pencil = null; // null ve emty ""

        System.out.print(pencil);*/

        byte x=10;
        byte y=20;
        byte z=(byte)(x+y);    // x+y int olduğu için byte ifadesi gerekir


    }


}
