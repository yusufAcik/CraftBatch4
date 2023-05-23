package day55_MapAndFinish;

import java.util.*;

public class C03_MapMethods {

    public static void main(String[] args) {
        // put(), get(), values(), keyset(), clear(), containsKey(), replace(),
        // remove(), entrySet(), equals(), forEach(), isEmpty(), putAll()

        Map<Integer,String> map = new TreeMap<>(); // keylere göre doğal sıralama
        map.put(12,"yusuf");
        map.put(13,"ali");
        System.out.println(map.get(12));
        System.out.println(map.get(13));

        Map<Integer,String> map2 = new TreeMap<>(); // keylere göre doğal sıralama
        map2.put(12,"yusuf");
        map2.put(13,"ali");
        map2.put(15,"ahmet");
        System.out.println(map2.get(12));
        System.out.println(map2.get(13));

        System.out.println();

        Set<Integer> set = map.keySet();

        List<Integer> list = new ArrayList<>();
        set.forEach(x->list.add(x));
        Collections.sort(list);
        System.out.println(Collections.max(map.keySet()));

        // yeni bir id verelim

        Integer id = Collections.max(map.keySet())+1;
        map.put(id,"veli");
        map2.put(id,"veli");

        System.out.println(map);

        // map.clear(); hepsini siler

        System.out.println(map.containsKey(14)); // true verir

       // System.out.println(map.remove(12)); // hem siler hem de sildiği objeyi yazdırır
        System.out.println(map.remove(13, "ahmet")); // girilen veriler doğruysa siler true döndürür
     //   System.out.println(map.remove(13, "ali"));

        System.out.println(map.entrySet()); //=  Set<Map.Entry<Integer,String>> set1=map.entrySet();

        System.out.println(map);
        System.out.println(map2);

        System.out.println("----------------");

        System.out.println(map.equals(map2));

        System.out.println("---------------");


        map.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));

        System.out.println("-------------");

        System.out.println("map.isEmpty() = " + map.isEmpty());

        map.putAll(map2);

        System.out.println("map = " + map);

        System.out.println("map.replace(13,\"mehmet\") = " + map.replace(13, "mehmet"));
        System.out.println("map = " + map);
        System.out.println("map.replace(14,\"veli\",\"deli\") = " + map.replace(14, "veli", "deli"));


    }
}
