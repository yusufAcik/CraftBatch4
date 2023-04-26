package day34_Arrays_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {

        String str="elma, armut, üzüm, çilek, nar";

        System.out.println("Arrays.toString(fruitSwap(str)) = " + Arrays.toString(fruitSwap(str)));

        String str2="merhaba java insanları bugün nasılsınız";

        System.out.println("Arrays.toString(secondWordLetters(str2)) = " + Arrays.toString(secondWordLetters(str2)));

    }
    //«elma, armut, üzüm, çilek, nar» cümlesindeki
    // meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın.
    // İlk ve son idexi swaping yapın
    public static String[] fruitSwap (String str){
        String [] strArr=str.split(", ");
        String temp=strArr[0];
        strArr[0]=strArr[strArr.length-1];
        strArr[strArr.length-1]=temp;
        return strArr;
    }
    // «merhaba java insanları bugün nasılsınız»
    // gibi bir cümlenin ikinci kelimesinin
    // harflerinden bir döndüren method yazın.

    public static char[] secondWordLetters (String str){
        char[] chArr=null;
        String [] strArr=str.split(" ");
        chArr=strArr[1].toCharArray();
        return chArr;
    }

}
