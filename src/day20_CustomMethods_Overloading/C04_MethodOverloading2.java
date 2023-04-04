package day20_CustomMethods_Overloading;

public class C04_MethodOverloading2 {

    public static void main(String[] args) {
        calculateArea(3,5);
        calculateArea(4,4);
        calculateArea(3);
    }
    public static void calculateArea(int a, int b){
        System.out.println(a*b);
    }
    // cannot overload with return type;
    //public static int calculateArea(int a, int b){
    //   return a*b;
    //}

    public static void calculateArea(int radius){
        System.out.println(Math.round(Math.PI*radius*radius));
    }

}
/*CalculateArea isminde  method yazın ve overload olsun.
 Birincisi kare-dikdörtgen alanını hesaplasın.
 İkincisi dairenin alanını hesaplasın. PI: 3,14/


 */