package day32_Arrays_2;

import java.util.Arrays;

public class C03_ArraysToString {

    public static void main(String[] args) {
        String arr[]=new String[4];
        arr[0]="Yusuf";
        arr[1]="Mehmet";
        arr[2]="Celal";
        arr[3]="Emine";
        System.out.println(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("toString(arr) = " + toString(arr));
        System.out.println("toString2(arr) = " + toString2(arr));

    }
    // kendi toString methodumuzu yapalım

    public static String toString(String [] array){
        String result="[";
        for (String str:array){
            result+=str+", ";
        }
        result+="]";
        return result;
    }
    // foreach te hareket kabiliyeti kısıtlı
    // o yüzden for ile yapıyoruz

    public static String toString2(String [] array){
        String result="[";
        for (int i=0;i<array.length;i++){
            if(i==array.length-1){
            result+=array[i];
            }else {
                result+=array[i]+", ";
            }
        }
            result+="]";
            return result;
        }






}
