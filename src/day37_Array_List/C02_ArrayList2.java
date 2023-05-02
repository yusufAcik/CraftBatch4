package day37_Array_List;

import java.util.ArrayList;

public class C02_ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("ali");
        arrayList.add("veli");
        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ahmet");
        arrayList.add("mehmet");

        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("ahmet");
        arrayList2.add("mehmet");

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);

        // arrList1 elma armut kayısı üzüm erik
        // arrList2 armut kayısı üzüm
        // 1 den 2 yi çıkaralım

        ArrayList<String> arrList1=new ArrayList<>();
        arrList1.add("elma");
        arrList1.add("armut");
        arrList1.add("kayısı");
        arrList1.add("üzüm");
        arrList1.add("erik");

        ArrayList<String> arrList2=new ArrayList<>();

        arrList2.add("armut");
        arrList2.add("kayısı");
        arrList2.add("üzüm");

        System.out.println(arrList1);
        System.out.println(arrList2);

        arrList1.removeAll(arrList2);
        System.out.println(arrList1);


    }
}
