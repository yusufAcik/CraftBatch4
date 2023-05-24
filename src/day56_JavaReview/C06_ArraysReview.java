package day56_JavaReview;

import java.util.Arrays;
import java.util.Map;

public class C06_ArraysReview {

    public static void main(String[] args) {


    int[] numbers = {5,10,15,20,25,30}; // array literal used
                    // if we know all the elememts if the array
    // int[] num;
    // num={1,2,3,4,5};  değer atamayı sonradan yapamayız

        System.out.println("numbers[3] = " + numbers[3]);
        numbers[5]=50;

        int [] numbers2= new int[6]; // new keyword if we know the number of elements
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i]= (int) Math.pow(3,i);
        }

        System.out.println(numbers);
        System.out.println(numbers2);

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));

        String [] arr1 = {"Ali","Veli","Deli"};
        String [] arr2 = {"Ahmet","Mehmet","Mustafa"};

        String [][] arr2D = {arr1,arr2};
        System.out.println("Arrays.toString(arr2D) = " + Arrays.toString(arr2D));
        // içindeki arraylerin referanslarını yazdırır

        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));
        // çok boyutlu arrayleri yazdırmak için deepToString kullanılır

        char [] hollyNameChars = "yusuf".toCharArray();

        for (int i = 0; i < hollyNameChars.length; i++) {
            System.out.println(hollyNameChars[i]);
        }
        System.out.println("--------------------------");
        for (char hollyNameChar : hollyNameChars) {
            System.out.println(hollyNameChar);
        }


    }
}
