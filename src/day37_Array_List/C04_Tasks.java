package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class C04_Tasks {

    public static void main(String[] args) {

        System.out.println(myList(20));
        System.out.println();
        System.out.println("(randomArrList(20)) = " + (randomArrList(20)));

        ArrayList<String> arrStringList=new ArrayList<>();
        arrStringList.add("10");
        arrStringList.add("100");
        arrStringList.add("101");
        arrStringList.add("1000");

        System.out.println(toIntList(arrStringList));

        ArrayList<Integer>arrList=new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        System.out.println(dondur(arrList, 1));

        System.out.println();

        System.out.println("Arrays.toString(toIntArr(arrList)) = " + Arrays.toString(toIntArr(arrList)));

    }
    //ArrayList<Integer> myList = getList(20);//return method
    //System.out.println(myList);
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

    public static ArrayList<Integer> myList (int size){
        ArrayList<Integer> arrList=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrList.add(i+1);
        }
        return arrList;
    }

    // random(20); bir method oluşturup 20 size li 20 ye kadar random
    //rakamlardan oluşan bir ArrayList döndüren method oluşturalım.
    //Random class using example/Random class kullanım örneği
    //Random rm = new Random();
    //rm.nextInt(20)

        public static ArrayList<Integer> randomArrList (int sayi){

            Random rm=new Random();
            rm.nextInt(sayi);


        ArrayList<Integer> arrList=new ArrayList<>();
        for (int i = 0; i < sayi; i++) {

            arrList.add(rm.nextInt(sayi));
        }
        return arrList;
    }


    // "10","100","101","1000" sayılarını stringNums isimli
    // arrayList e atalım.
    //toIntList(stringNums); methodu Integer bir
    // arrayList e convert edip
    //döndürelim.

    public static ArrayList<Integer> toIntList(ArrayList<String> arrStringList){
        
        ArrayList<Integer>arrIntList=new ArrayList<>();
        for (int i = 0; i < arrStringList.size(); i++) {
            arrIntList.add(Integer.valueOf(arrStringList.get(i)));
        }
        return arrIntList;
    }

    // yeni bir arraylist oluşturup içine 5 adet sayı ekleyin
    // dondur(int x) x kadar sayıları kendi içinde döndürsün
    // 12345  (dondur(int 1)) -> 51234  int 3 -> 34512

    public static ArrayList<Integer> dondur(ArrayList<Integer> arrList, int x){

        ArrayList<Integer>newArrList=new ArrayList<>();

        int num=0;
        for (int i = 0; i <arrList.size() ; i++) {
           if (i<=x-1){
                newArrList.add(arrList.get(arrList.size()-x+i));
        }else {
               newArrList.add(arrList.get(num));
               num++;
           }
        }
        return newArrList;
    }

    // stringNums isimli arrayList i
    //toIntArr(stringNums); methodu ile int bir array e convert edip
    //döndürelim.

    public static int [] toIntArr (ArrayList<Integer> arrList){
        int [] newArr = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            newArr[i]=arrList.get(i);
        }
        return newArr;
    }
}
