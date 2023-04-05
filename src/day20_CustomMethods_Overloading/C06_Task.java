package day20_CustomMethods_Overloading;

public class C06_Task {

    public static void main(String[] args) {
        int alan1=calculateArea(45,23);
        System.out.println("alan1: "+alan1);
        System.out.println();
        System.out.println("----------------");
        double alan2=calculateArea(27);
        System.out.println("alan2 = " + alan2);
    }

    /**
     * a method that can calculate the area of rectangle or square
     * @param a
     * @param b
     * @return
     */
    public static int calculateArea(int a,int b){
        return (a*b);
    }

    /**
     * a method that can calculate the area of circle
     * @param r
     * @return
     */
    public static double calculateArea(int r){
        double PI=3.14;
        return (PI*r*r);
    }
}
// CalculateArea isminde 2 method yazın ve overload
//olsunlar. Birincisi kare-dikdörtgen alanını hesaplasın.
//İkincisi dairenin alanını hesaplasın. PI: 3,14

