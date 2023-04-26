package day34_Arrays_4;

public class C07_ArraysLab {


    // Örnek 1: Array’in içerisindeki tüm sayıların
    // toplamını veren metodu yazınız..

    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Örnek 2: Array’in içerisindeki tüm çift sayıların
    // toplamını veren metodu yazınız.

    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                sum += i;
        }
        return sum;
    }

    // Örnek 3: Array’in içerisindeki tüm 3 sayılarının
    // toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9

    public static int sumOfThreeElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i == 3)
                sum += i;
        }
        return sum;
    }
}
