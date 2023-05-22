package day54_LoopsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_CollectionSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,21,1,23,43,565,6667,76775,33,90);
        System.out.println(list.get(0));
        Collections.sort(list); // içeriği kalıcı olarak değiştirir
        System.out.println(list.get(0));

        System.out.println("-----------------");

        List<String> list2 = Arrays.asList("yusuf","ahmet","mehmet");
        System.out.println(list2.get(0));
        Collections.sort(list2); // içeriği kalıcı olarak değiştirir
        System.out.println(list2.get(0));

        System.out.println("max(list) = " + max(list));
        System.out.println("Collections.max(list) = " + Collections.max(list));

    }

    public static int max (List<Integer> list){
        List<Integer> copyList = new ArrayList<>();
        // orijinal içeriği değiştirmemek için kopyası üzerinden işlem yapıyoruz
        copyList.addAll(list);
        Collections.sort(copyList);
        return copyList.get(copyList.size()-1);
    }

}
