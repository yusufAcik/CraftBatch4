package mentoring11_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {

    public static void main(String[] args) {
        /*
        1.ArrayList= resizable array
        2.Arraylist içine Obje depolayabiliyoruz(String, Integer, Double...)
                non primitive depolayamayız (int, boolean, double)
        3.Arraylistler ayrı bir method olmadan yazdırılabilir
         */

       // ArrayList<int>  arraylistler primitive kabul etmez obje depolar

        ArrayList<Integer> integers; // default null gelir
       // integers=new ArrayList<>();
        ArrayList<Integer> integers1=new ArrayList<>();
        ArrayList<String> fruits=new ArrayList<>();
        ArrayList<Double> doubles=new ArrayList<>(); // size belirtmek zorunda değiliz

        // add();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits); // ekleme sırasına göre yazdırır

        // eklemeyi istediğimiz indexe yapalım

        fruits.add(0,"Cherry");
        System.out.println(fruits);

        fruits.add(2,"Watermelon");
        System.out.println(fruits);

        // get()  çağırma

        System.out.println(fruits.get(3));

        // how to change an item
        // set()

        fruits.set(2, "Orange");
        System.out.println(fruits);

        // remove an item
        // remove();
        // 1. remove by index

        fruits.remove(2);
        System.out.println(fruits);

        // 2. Removing by object
        fruits.remove("Apple");
        System.out.println(fruits);

        // her şeyi kaldırmak istersek
        // clear();

       // fruits.clear();
       // System.out.println(fruits); // boş döner []

        // size of ArrayList
        // size();

        System.out.println(fruits.size());

        // ArrayList yazdırma

        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i)+" ");
        }

        // Arraylistlerde sıralama numerik ve alfabetik

        Collections.sort(fruits);
        System.out.println(fruits);

    }
}
