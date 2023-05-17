package day51_Collection_List;

import java.util.*;

public class C01_Collections {

    public static void main(String[] args) {


    /* Collection nesneleri bir arada tutan yapılar
        karşılaşılan durumlara göre kullanılan collection
        yapıları farklılık gösterir.
        Hangi collection yapısını kullanacağımızı belirleriz.

        3 Ana collection tipi var
          1. List  :  ArrayList, LinkedList, Vector(Stack)
          2. Queue : Priority Que, ArrayQue
          3. Set : Hashset, Linkedhashset,TreeSet

          interfacelerden obje oluşturamadığımız için
          child classlardan consstructorlarla obje oluşturabiliriz.

     */

        int[] arr = new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
       //  arr[4]=5;  ArrayIndexOutOfBoundException


      //   List<String> coll = new List<String>(); interface olduğu için obje oluşturamıyoruz
            List<String > coll2 = new ArrayList<>();
            List<Object > coll3 = new LinkedList<>();
            Queue<String> coll4 = new LinkedList<>();
            Queue<String> coll5 = new PriorityQueue<>();
            List<String > coll6 = new Stack<>();
            List<String > coll7 = new Vector<>();

            Set<String > coll8 = new HashSet<>();
            Set<String > coll9 = new TreeSet<>();
            Set<String > coll10 = new LinkedHashSet<>();
            HashSet<String > set1 = new HashSet<>();



}
}