package mentoring01_Conversion_Casting;

public class _03_NumString {

    public static void main(String[] args){

  /*  String str="65";
    int i=65;
   // int toplam=i+str; hata verir

        // kelimenin sayıya çevvrilmesi
        int strToNum=Integer.parseInt(str);
        System.out.println("strToNum = " + strToNum);
        System.out.println("str = " + str);
        int toplam=i+strToNum;
        System.out.println("toplam = " + toplam);

        // sayının kelimeye çevrilmesi
        String numToStr=Integer.toString(i);
        System.out.println("numToStr = " + numToStr);
*/

        int a=254; // byte -128 den +127 ye kadar toplam 256
                    // byte ın içine atılan byte değerleri
                    // dışındaki sayılar mod 265 e göre konsola yansır
        byte b=18;

        b=(byte)a;
        System.out.println("b = " + b);


    }



}
