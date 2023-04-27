package day35_Arrays_Summary;

import java.util.Arrays;

public class ArraysLabCont {

    public static void main(String[] args) {

      int[] arr1={5,4,3,2,1};
      int[] arr2={1,2,3,4,5,7,9};

        System.out.println("ikinciArraydeVarMi(arr1,arr2) = " + ikinciArraydeVarMi(arr1, arr2));


        System.out.println(Arrays.toString(araIndexOlustur(15, 8)));
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
