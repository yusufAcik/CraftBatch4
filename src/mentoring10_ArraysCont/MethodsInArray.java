package mentoring10_ArraysCont;

import java.util.Arrays;

public class MethodsInArray {

    public static void main(String[] args) {

        int[] plakalar = {1, 4, 34, 56, 47, 6, 35};

        int[] sayilar = {12, 44, 32, 10, 56, 24, 76, 12};
        ilkVeSonElementKontrol(plakalar);
        ilkVeSonElementKontrol(sayilar);

        System.out.println("-------------------");

        String[] kulupler = {"Beşiktaş", "Galatasaray", "Fenerbahçe", "Trabzonspor", "Ankaragücü"};

        ilkElementKontrol(kulupler,new String[]{"Barcelona","Milan","Real Madrid"});

        System.out.println("---------------------");

        System.out.println("Reverse arrayden dönen değerler");
        for(int i:reverseArray(sayilar)){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseArray(sayilar)));
    }

    public static void ilkVeSonElementKontrol(int[] abc) {
        if (abc[0] == abc[abc.length - 1]) {
            System.out.println("dizinin ilk ve son elamanı birbirine eşit.");
        } else {
            System.out.println("Dizinin ilk ve son elemanı birbirine eşit değil.");
        }
    }

    public static void ilkElementKontrol(String[] str1, String[] str2) {
        if (str1[0].equalsIgnoreCase(str2[0])) {
            System.out.println("dizinin ilk ve son elamanı birbirine eşit.");
        } else {
            System.out.println("Dizinin ilk ve son elemanı birbirine eşit değil.");
        }
    }

    public static int [] reverseArray(int[] arr){

        //  int[] plakalar = {1, 4, 34, 56, 47, 6, 35};

        int [] newArray=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[arr.length-(i+1)];
        }
        return arr;
    }
}
