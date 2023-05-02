package day36_WrapperClass;

import java.util.Arrays;

public class C04_Task {
    public static void main(String[] args) {

        // string içindeki sayıları bir array içinde döndüren bir method yazınız

        String str ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<||l|>>012345679--a**//##++34r``~~((ı[234]+||";
        System.out.println("metindekiSayilar(str) = " + Arrays.toString(metindekiSayilar(str)));

        System.out.println("Arrays.toString(textNumber(str)) = " + Arrays.toString(textNumber(str)));

    }

    public static String [] metindekiSayilar (String str){
       String sayilar="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sayilar+=str.charAt(i);
            }
        }

        String [] yeniArray=sayilar.split("");

        return yeniArray;
    }

    public static int[] textNumber(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
           if( Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        String [] arr=result.split("");
        int[]arrNew=new int[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i]=Integer.parseInt(arr[i]);
        }
        return arrNew;
    }

}
