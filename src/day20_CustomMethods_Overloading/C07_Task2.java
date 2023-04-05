package day20_CustomMethods_Overloading;

public class C07_Task2 {

    public static void main(String[] args) {
        birMethod(12,"Merhaba",true);
    }
    public static void birMethod(int a, String str, boolean bl){
        if(bl==true) System.out.println(a+str);
        else System.out.println(baskaMethod(str, a));
    }

    private static String baskaMethod(String str,int a) {
        for (int i = 1; i <=a ; i++) {
            System.out.println(str);
        }
        return str;
    }

}
/* Bir method yazın 3 parametreli olsun. İnt ve String type
ve birde boolean. Boolean true ise int ve String değeri
concat yapsın. False ise başka bir methodu çağırsın ve
String değeri int kadar yazdırsın.
*/