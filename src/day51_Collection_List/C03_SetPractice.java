package day51_Collection_List;

import java.util.*;

public class C03_SetPractice {

    // collectionlarda Set lerle karşılaşmamız muhtemel
    // (eleman tekrarı kabul etmediği için)

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));

        System.out.println("list = " + list);
        System.out.println("list.get(3) = " + list.get(3));

        System.out.println("------------------------");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100)); // Random
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("hashSet = " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100)); // Insert Order Preserved
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(null,null,null));
        // veri sorgulayıp Set içine atarken null gelebilir

        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();             // Sorted Ascending (Artan şekilde sıralı)
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
       // treeSet.addAll(Arrays.asList(null,null,null));  // runtime error verir
        System.out.println("treeSet = " + treeSet);



    }
}
