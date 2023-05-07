package mentoringArraysCont;

import java.util.Arrays;

public class ArraysMethod {

    public static void main(String[] args) {

        int[] dizi1={1,2,3};
        int[] dizi2={1,2,3};

        float f=3.14f;
        String str="abc";
                str.valueOf(f);

        int[] plakalar = {1, 4, 34, 56, 47, 6, 35};

        String names[]={"Ali","Veli","Ahmet","Mehmet"};

        String str1=new String("Hello");
        String str2=new String("Hello");

        System.out.println((str1==str2)); // false verir çünkü referanslar farklı
        System.out.println((str1.equalsIgnoreCase(str2)));

        System.out.println();

        for(String s:names){
            System.out.print(s+" ");
        }

        System.out.println();

        // toString
        System.out.println(Arrays.toString(names));

        // sort -> elemanları sıralar
        Arrays.sort(names);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

       // Arrays.sort(plakalar);
        System.out.println("Arrays.toString(plakalar) = " + Arrays.toString(plakalar));

        Arrays.sort(plakalar,3,7);
        System.out.println("Arrays.toString(plakalar) = " + Arrays.toString(plakalar));

        // fill
        int[]sayilar=new int[5];
        Arrays.fill(sayilar,7);
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));

        int[]arr1={2,4,6,8,10};
        int[]arr2=arr1;

        System.out.println(Arrays.toString(arr2));

        arr1[0]=20;
        arr2[4]=100;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));




    }
}
