package day35_Arrays_Summary;

import java.util.Arrays;

public class Fill {

    public static void main(String[] args) {

        int[] arr={9,6,3,1,0,2,4,7,8,5};
       // Arrays.fill(arr,0,5,10); // (arr,0) yazarsak hepsini 0 doldurur
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(doldur(arr, 0, 3, 100)));

    }

    public static int[] doldur(int[]arr,int from,int to,int value){
        int[] resultArray=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.fill(resultArray,from,to,value);
        return Arrays.copyOfRange(resultArray,0,arr.length);
    }


}
