package mentoring01_Conversion_Casting;

public class _01_Widening_Casting {

    public static void main(String[] args){

        // byte->short->int->long - > float - > double otomatik dönüşüm

        int sayi=9;
        double deger=5.5;
        deger=sayi;
        System.out.println("deger = " + deger);


    }


}
