package mentoring22_CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo {

    public static void main(String[] args) {

        int n = 5;

        int nums[] = new int[5];

        nums[0]=4;

        int nums2[]=new int[7];

        System.out.println(Arrays.toString(nums));

        Collection<Integer> nums3 = new ArrayList();  // polymorphism -> collection, arraylist gibi davranıyor

        nums3.add(3);
        nums3.add(5);
        nums3.add(7);
        nums3.add(9);
       // nums3.add("6"); // bu şekilde runtime error verir
        // compile time error vermesi için yukarıda type belirtmek gerekir



        System.out.println("nums3 = " + nums3);


        for (int o:nums3){
            int num=(Integer)o;
            System.out.println(num+2);
        }

       // nums3.get(1);  // collection da get yok arraylist te var cast edebiliriz


        /*
        CollectionAPI --- Application Programming Interface

        Collections ---- Collection interface ini implement eden classlar

                        Iterable (interface)

                        Collection (interface)

            List            Queue               Set ---  hepsi birer interface

            Arraylist       Deque               HashSet
            LinkedList                          LinkedHashSet

            List interface  --- tekrarlanan verileri tutabilir
            Set interface  ---  unique verileri tutar
            HashSet         --- sorted vermez

            value       12  323  434    3446
            index       0   1     2      3

            value       34       34      65      12      -> list yapısı(duplicate var)
                                                                               ikisinin birleşimi MAP yapısı
            key         ali    ismail   ahmet  ayşe      -> set yapısı (duplicate yok)


         */

    }
}
