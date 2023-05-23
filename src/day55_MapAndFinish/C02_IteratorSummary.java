package day55_MapAndFinish;



import java.util.*;

public class C02_IteratorSummary {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(8);
        set.add(9);
        set.add(99);
        set.add(55);

        for (Integer x:set){
            System.out.print(x+" ");
        }

        System.out.println();

        // objeler arasında dolaşıp değişiklik yapmak istiyorsak
        // Iterator kullanmalıyız

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer sayi = iterator.next();
            if(sayi<25){
                iterator.remove();
            }
        }
        System.out.println(set);

        System.out.println();

        // pratik işlemler için forEach() metodu

        set.forEach(x-> System.out.println(x));

        List<String> list = Arrays.asList("yusuf","ali","veli");

        list.forEach(y-> System.out.println(y+" nasılsın?"));

    }
}
