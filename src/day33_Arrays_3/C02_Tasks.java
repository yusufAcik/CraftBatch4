package day33_Arrays_3;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Tasks {
    public static void main(String[] args) {

        int intArr[]={1,20,3,400,50,6};

        System.out.println("maxOfArray(intArr) = " + maxOfArray(intArr));

        System.out.println("minOfArray(intArr) = " + minOfArray(intArr));

       // System.out.println("Arrays.toString(swapFirstAndLast(intArr)) = " + Arrays.toString(swapFirstAndLast(intArr)));

        System.out.println("Arrays.toString(reversedArray(intArr)) = " + Arrays.toString(reversedArray(intArr)));

        System.out.println("sumOfOddElements(intArr) = " + sumOfOddElements(intArr));

        System.out.println("Arrays.toString(createStringArray()) = " + Arrays.toString(createStringArray()));
    }

    // İnt arry in en büyük elemanının döndüren bir method yazın

    public static int maxOfArray (int[]arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    // İnt arry in en küçük elemanının döndüren bir method yazın

    public static int minOfArray (int[]arr){
        int min=arr[0];
        for (int i:arr) {
            if(min>i){
                min=i;
            }
        }
        return min;
    }

    // bir array oluşturup ilk ve son elemanlarının swap yapalım

    public static int [] swapFirstAndLast (int[]arr){
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }

    // Bir method yazın ve verilen arry in elemanlarını
    // tersten sıralayıp yeni bir array döndürsün.

    public static int [] reversedArray(int[]arr){
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1 ,  j=0; i >= 0; i--,j++) {
            reversedArr[i]=arr[j];
        }
        return reversedArr;
    }
    //Bir methodla verilen array ın teksayı
    // indexinde bulunan elemanların toplamını alın.

    public static int sumOfOddElements (int[]arr){
        int sum=0;
        for (int i = 1; i < arr.length; i+=2) {
            sum+=arr[i];
        }
        return sum;
    }
    // string array in  length ve elemanlarını kullanıcıdan alalım

    public static String [] createStringArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("String array in uzunluğunu giriniz: ");
        int length=scan.nextInt();
        scan.nextLine();
        String strArr[]=new String[length];
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(i+1+" numaralı elemanı giriniz: ");
            String eleman=scan.nextLine();
            strArr[i]=eleman;
        }

        return strArr;
    }
}
