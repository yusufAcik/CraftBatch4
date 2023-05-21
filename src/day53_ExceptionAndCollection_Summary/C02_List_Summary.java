package day53_ExceptionAndCollection_Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_List_Summary {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // list in arraylist gibi davranmasını istediğimiz için polymorphism yaptık.
        // Arraylist in list e override etttiği metodlara ulaşmak amaç
        // Arraylist in diğer metodlarını istemiyoruz

        list.addAll(Arrays.asList("yusuf","ali","veli"));
        list.add("ahmet");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list);
        list.addAll(Arrays.asList("yusuf","ali","veli"));
        list.removeAll(Arrays.asList("ali","veli"));
        System.out.println(list);
        list.addAll(Arrays.asList("yusuf","ali","veli"));
        list.retainAll(Arrays.asList("ali","veli")); // yazılanlar dışınkdaki herşeyi siler
        System.out.println(list);
        System.out.println(list.contains("ali"));
        System.out.println(list.containsAll(Arrays.asList("ali", "veli")));


    }
}
