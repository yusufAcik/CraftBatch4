package day32_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {

        // System.out.println("kelimeDepola()[2] = " + kelimeDepola()[2]);
        int array[] = {5, 24, 23, 45, 576, 56, 78, 89, 109};
        int array1[] = {1, 3, 5};
        int array2[] = {5, 45, 56, 67};
        System.out.println("uzunlukKontrol(array) = " + uzunlukKontrol(array));

        if (uzunlukKontrol(array)) {
            System.out.println("uzunluk 5 ten büyük");
        } else {
            System.out.println("uzunluk 5 ten küçük");
        }

        System.out.println("besVarMi(array) = " + besVarMi(array, 5));

        System.out.println("ilkElemanEsitMi(array,array2) = " + ilkElemanEsitMi(array, array2));

        double array3[] = {5, 24, 23, 45, 576, 56, 78, 89, 109};
        double array4[] = {5, 45, 56, 67};

        System.out.println("Arrays.toString(yeniArray(array3,array4)) = " + Arrays.toString(yeniArray(array3, array4)));

        System.out.println("arrayToplam(array2) = " + arrayToplam(array2));

        System.out.println(Arrays.toString(arrayToplamVeCarpim(array1)));

        arrayYazdir(array);

        System.out.println();

        arrayYazdir(arrayBirlestir(array1,array2));
        System.out.println();
        arrayYazdir(arrayBirlestir2(array1,array2));


    }

    public static String[] kelimeDepola() {
        String array[] = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Kelime");
        String kelime1 = scan.nextLine();
        array[0] = kelime1;
        System.out.println("2. Kelime");
        String kelime2 = scan.nextLine();
        array[1] = kelime2;
        System.out.println("3. Kelime");
        String kelime3 = scan.nextLine();
        array[2] = kelime3;
        return array;
    }

    // bir method yazın ve int[] kabul etsin.
    // length 5 ten büyükse true döndürsün

    public static boolean uzunlukKontrol(int[] arr) {
        return arr.length > 5;
    }

    //Bir method yazın int array kabul etsin
    // array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean besVarMi(int[] arr, int kontrol) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == kontrol) {
                return true;
            }
        }
        return false;
    }

    // 2 array in ilk elemanları eşit mi kontrol eden method

    public static boolean ilkElemanEsitMi(int[] arr1, int[] arr2) {
        return arr1[0] == arr2[0];
    }

    public static boolean ilkElemanEsitMi(String[] arr1, String[] arr2) {
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }

    // 2 array kabul eden ve ilk elemanları ile yeni bir array döndüren method

    public static double[] yeniArray(double[] x, double[] y) {
        double[] array = new double[2];
        array[0] = x[0];
        array[1] = y[0];

        return array;
    }

    public static double[] yeniArray(int[] x, int[] y) {
        double[] array = {x[0], y[0]};
        return array;
    }

    // int array in elemanlarının toplamını veren bir method

    public static int arrayToplam(int[] arr) {
        int result = 0;
        for (int sayi : arr) {
            result += sayi;
        }
        return result;
    }

    // int array in elemanlarının toplamını ve çarpımını
    // yeni bir arrayde döndüren method

    public static int[] arrayToplamVeCarpim(int[] arr) {
        int toplam = 0;
        int carpim = 1;
        int yeniArray[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            carpim *= arr[i];
        }

        yeniArray[0] = toplam;
        yeniArray[1] = carpim;
        return yeniArray;
    }

    // array yazdırma methodu

    public static void arrayYazdir (int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else
                System.out.print(arr[i]+"-");
        }
    }
    public static void arrayYazdir (double[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else
                System.out.print(arr[i]+"-");
        }
    }

    public static void arrayYazdir (String[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else
            System.out.print(arr[i]+"-");
        }
    }

    public static void arrayYazdir (char[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else
                System.out.print(arr[i]+"-");
        }
    }
    public static void arrayYazdir (boolean[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else
                System.out.print(arr[i]+"-");
        }
    }

    // verilen 2 array i birleştirme

    public static int[] arrayBirlestir(int[] arr1,int[] arr2){
        int[] yeniArray=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            yeniArray[i]=arr1[i];
        }
        int j=0;
        for (int i = arr1.length ; i < yeniArray.length ; i++) {
            yeniArray[i]=arr2[j];
            j++;
        }
        return yeniArray;
    }
    // aynı methodu daha kısa yazalım

    public static int[] arrayBirlestir2(int[] arr1,int[] arr2){
        int[] yeniArray=new int[arr1.length+arr2.length];
        for (int i = 0, j=0; i < yeniArray.length; i++) {
            if(i<arr1.length){
            yeniArray[i]=arr1[i];
        }else {
             yeniArray[i]=arr2[j];
             j++;
            }
        }
        return yeniArray;
    }

}
