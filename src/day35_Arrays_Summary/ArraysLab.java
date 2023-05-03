package day35_Arrays_Summary;

import java.util.Arrays;

public class ArraysLab {

    public static void main(String[] args) {

      int[] arr1={5,4,3,2,1};
      int[] arr2={1,2,3,4,5,7,9};

        System.out.println("sumOfArrayElements(arr1) = " + sumOfArrayElements(arr1));

        System.out.println("sumOfEvenElements(arr1) = " + sumOfEvenElements(arr1));

        System.out.println("ikinciArraydeVarMi(arr1,arr2) = " + ikinciArraydeVarMi(arr1, arr2));

        System.out.println("sumOfThreeElements(arr1) = " + sumOfThreeElements(arr1));

        System.out.println("Arrays.toString(enBuyukVeEnKucukSayi(arr2)) = " + Arrays.toString(enBuyukVeEnKucukSayi(arr2)));

        System.out.println("Arrays.toString(enKucukSayiyiAta(arr2)) = " + Arrays.toString(enKucukSayiyiAta(arr2)));

        System.out.println(Arrays.toString(araIndexOlustur(15, 8)));
    }

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
    //Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız.
    // (Arrays.sort kullanılmayacak)

    public static int[] enBuyukVeEnKucukSayi(int[] arr){
        int[]result=new int[2];
        result[0]=arr[0];
        result[1]=arr[0];
        for (int i : arr) {
            if(i<result[0]){
                result[0]=i;
            }
            if(i>result[1]){
                result[1]=i;
            }
        }
        return result;
    }

    // Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.
    // (Arrays.sort ve Arrays.fill kullanılmayacak)
    //[1,2,-8,-9] [-9,-9,-9,-9]

    public static int[] enKucukSayiyiAta(int[] arr){
        int[]result=new int[arr.length];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i]=min;
        }
        return result;
    }

    // Örnek 6 2 adet int sayı alan ve arasındaki sayıları indexlere
    // atayan method
    public static int[] araIndexOlustur(int x,int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);
        int[] resultArray=new int[max-min+1];
        for (int i=min,j=0;i<=max;i++,j++){
            resultArray[j]=i;
        }
        return resultArray;
    }
    // Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
    //yer almıyorsa false yazdıran metodu yazınız.
    //[5,4,3,2,1] , [1,2,3,4,5,7,9] true
    //[5,4,3,2,1,7,5] , [1,2,3,4,5] false

    public static boolean ikinciArraydeVarMi(int[] arr1, int[] arr2){

      firstLoop:  for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    continue firstLoop;
                }
            }
            return false;
        }
        return true;
    }

}
