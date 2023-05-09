package day44_FinalAndHiding;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        final String[] strArr={"Ali","Veli","Deli"};
              String[] strArr2={"Ahmet","Mehmet","Ayşe"};
       // strArr=strArr2; // hata verir referansı değiştiremeyiz
          strArr2=strArr;  // hata vermez

        final ArrayList<Integer> arrList=new ArrayList<>();
              ArrayList<Integer> arrList2=new ArrayList<>();
        arrList.add(200);
        arrList.add(350);
        arrList.set(0,600);
       // arrList=arrList2; // hata verir
        arrList2=arrList;  // hata vermez
/*
        FinalExample finalExample=new FinalExample();
        System.out.println(finalExample.x); // 5 yazar
        finalExample.method();      // 35 bulur yazmaz
        System.out.println(finalExample.x); // 7 yazar

        X final olduğu için hata verdi
 */
    }
}
