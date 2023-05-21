package day53_ExceptionAndCollection_Summary;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set_1 {

    /*
    list yinelenen verileri kabul eder; set etmez
    list ekleme sırasını korur; set korumaz.
     */
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        // treeset yinelenen veri kabul etmez
        // verileri küçükten büyüğe (doğal) sıralar
        // hashset kendine göre bir sıralama yapar

        set.add("5");
        set.add("4");
        set.add("5");
        set.add("8");

        System.out.println(set);
    }
}
