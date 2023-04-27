package day35_Arrays_Summary;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] arr={9,6,3,1,0,2,4,7,8,5};
        System.out.println(maxArray(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static int maxArray(int[] arr) {
        int[]yeniArray= Arrays.copyOfRange(arr,0,arr.length);
        // copy of range yerine  "yeniArray=arr" kullanırsak
        // ve sort yaparsak orijinal arrayi kaybederiz
        Arrays.sort(yeniArray);
        return yeniArray.length-1;
    }
}
