package day3_Type_Conversion_Casting;

public class _04_AritmeticOperators {

    public static void main(String[] args){

       /* int a=5;
        int b=7;
        int toplam=a+b;

        System.out.println("toplam = " + toplam);

        byte by1=10;
        byte by2=30;
        int result=by1*by2; // byte değerleri dışında
                            // olduğu için int tanımladık
*/

        int num1=7;
        int toplam=num1+2;
        num1*=2; // işlemlerin kısa yolu
       // num1++; ve ++num1; num1+1 verir
        // num1++ post-increment -> yazdırır sonra 1 artırır
        // ++num1 pre-increment -> 1 artırır sonra yazdırır

        System.out.println("num1 = " + num1);
        System.out.println("toplam = " + toplam);


    }
}
