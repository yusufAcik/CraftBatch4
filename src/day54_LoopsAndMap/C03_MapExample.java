package day54_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C03_MapExample {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        /*
        Map ler key-value yapısını kullanır,
        collection gibi davranır ama collection değil
        ** hayatın her alanında kullanılır
            tc no - isim
            şase no - plaka
            posta kodu - ilçe

            **** MAP interface olduğu için obje oluşturulamaz
            map i implement eden claslardan obje oluşturulabilir.

            *** setlerde ve maplerde index yok list lerde var
                maplerde obje çağırırken key le çağırıyoruz

              ****   süslü parantez MAP i temsil eder
               *****     köşeli parantez ARRAY i temsil eder
         {
            "count":12345;     örnek   map (key-value) yapısı
        }

         */

        map.put("123","yusuf");
        map.put("1234","yusuf1");
        map.put("12345","yusuf2");
        System.out.println("map.get(\"1234\") = " + map.get("1234"));

        System.out.println("--------------------");

        Map<String,Double> meyveFiyat = new TreeMap<>();
        meyveFiyat.put("elma",15.50);
        meyveFiyat.put("elma",10.50); // key aynı olmak üzere value değiştirebiliriz
        meyveFiyat.put("muz",30.75);
        meyveFiyat.put("çilek",40.25);
        meyveFiyat.put("armut",25.00);

        System.out.println("meyveFiyat.get(\"elma\") = " + meyveFiyat.get("elma"));
        System.out.println("meyveFiyat = " + meyveFiyat); // treeMap olduğu için key e göre doğal sıraladı
        System.out.println("meyveFiyat.get(\"muz\") = " + meyveFiyat.get("muz"));
        meyveFiyat.remove("elma");
       // meyveFiyat.clear(); hepsini siler
        System.out.println("meyveFiyat = " + meyveFiyat);

        System.out.println("---------------");

        System.out.println("meyveFiyat.containsKey(\"armut\") = " + meyveFiyat.containsKey("armut"));
        System.out.println("meyveFiyat.containsValue(30.75) = " + meyveFiyat.containsValue(30.75));

        System.out.println("---------------");

        Set<String> set = meyveFiyat.keySet();
        set.forEach(x-> System.out.println(x));

        // for la fiyatları yazdırma

        for (String str:set) {
            System.out.println(meyveFiyat.get(str));
        }


    }
}
