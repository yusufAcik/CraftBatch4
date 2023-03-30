package day04_VariableCont;

public class VariablesPractise {

    public static void main (String[] args) {

        byte sinifMevcudu; // CamelCase kelimelerBitişikİkinciKelimedenİtibarenBaşHarflerBüyük //
        sinifMevcudu=32;

        short num1 =3000;

        int num2 = 814_578;


        System.out.print("sinifMevcudu = ");
        System.out.println(sinifMevcudu);
        System.out.println("-------------");
        System.out.println("sinifMevcudu = " + sinifMevcudu);


        long num3 = 9_999_999_999l;
        System.out.println(num3+1);
        System.out.println(1+2);

        char ch1 ='A';
        System.out.println(ch1);

        String str1 = "JavaMaster";
        System.out.println(str1);
        System.out.println("str1 = " + str1);

        float num4 = 3.14f;
        System.out.println(num4);

        double PI = 3.14; // Constant sabit değerler büyük harfle yazılır.//

        System.out.println(PI);
        System.out.println("PI = " + PI);


    }

}
