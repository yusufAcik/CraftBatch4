package day33_Arrays_3;

import java.util.Arrays;
import java.util.Random;

public class C03_ArrayMethods {

    public static void main(String[] args) {
        // split()

        String str="Merhaba Güzel İnsanlar";
        String [] strArr=str.split(" ");
        String [] strArr2=str.split("");
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArr2));

        System.out.println(strArr.length);
        System.out.println(strArr2.length);

        System.out.println(strArr[1]);
        System.out.println(strArr2[12]);

        System.out.println("--------------------");

        // toCharArray()  Array in elemanlarını tek tek char a döndürür
        char[] charArr=str.toCharArray();
        System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));
        Arrays.sort(charArr);
        System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));


        // copyOfRange()
        String [] sturdents= {"Yunus","Emre","Emine","Ayşe","Serkan","Ümit"};
        String[]ourClass=Arrays.copyOfRange(sturdents,2,5);
        System.out.println("Arrays.toString(ourClass) = " + Arrays.toString(ourClass));
        String [] newMembers=Arrays.copyOf(sturdents,2);
        System.out.println("Arrays.toString(newMembers) = " + Arrays.toString(newMembers));

        System.out.println("--------------------");

        // sort() sıralama Stringlerde yok Arraylerde var
        // sort arrayi değiştirir yeni bir array oluşturmaz
        // arrayin orijinal halini saklamak gerekir.

        Random random=new Random();
        int [] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // fill()
        int [] num2=new  int[4];
        num2[0]=5;
        num2[1]=4;
        num2[2]=3;
        num2[3]=2;

        System.out.println(Arrays.toString(num2));
        Arrays.fill(num2,9); // hepsini 9 doldurur
        System.out.println(Arrays.toString(num2));
        Arrays.fill(num2,1,3,9); // belirtilen yerleri 9 doldurur
        System.out.println(Arrays.toString(num2));


    }
}
