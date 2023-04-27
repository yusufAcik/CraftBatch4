package day35_Arrays_Summary;

import java.util.Arrays;

public class ArraysSummary {
    public static void main(String[] args) {
        int [] degisken = new int[3];
        int [] degisken1 = {5,10,20};
        System.out.println(degisken1); // referansı yazar
        System.out.println(degisken1[1]); // 10 yazar
       // System.out.println(degisken1[3]); // runtime error
        int array[]=new int[0]; // length 0 olabilir ama - değer olamaz
        int array1[]=new int[3];
        array1[2]=(int)5.0;

        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println(Arrays.toString(arr));
        String str=Arrays.toString(arr);
        String [] yeniArr = str.replace("[","").replace("]","").
                replace(",","").split(" ");
        String[] yeniArr1=str.substring(1,str.length()-2).replace(",","").split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int sayi : arr) {
            System.out.println(sayi);
        }

    }

    public static String arrayYazdir(int[] arr){
        String result="";
        for (int sayi:arr){
            result+=sayi;
        }
        return result;
    }

    public static String[] terstenYazdir (String str){
        String [] yeniArray=str.trim().split("");
        String [] resultArray=new String[yeniArray.length];
        for (int i = 0,j= yeniArray.length-1; i < yeniArray.length; i++,j--) {
            resultArray[i]=yeniArray[j];
        }
        return resultArray;
    }

}
