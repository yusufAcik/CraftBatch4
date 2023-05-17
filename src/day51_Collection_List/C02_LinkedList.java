package day51_Collection_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {

    public static void main(String[] args) {

        List<String > letters = new LinkedList<>();
        letters.add("k");
        letters.add("r");
        letters.add("a");
        letters.add("f");
        letters.add("t");
        letters.add("t");
        letters.add("e");
        letters.add("c");
        letters.add("h");

        System.out.println("letters.indexOf(\"r\") = " + letters.indexOf("r"));
        System.out.println("letters.indexOf(\"t\") = " + letters.indexOf("t"));
        System.out.println("letters.lastIndexOf(\"t\") = " + letters.lastIndexOf("t"));

        System.out.println(letters); // listi yazdırır çünkü clasın içinde toString metodu var
        letters.add("s");
        System.out.println(letters);
        letters.set(3,"l");
        System.out.println(letters);
        letters.add(4,"l");
        System.out.println(letters);

        List<String > target = new LinkedList<>();
        target.addAll(Arrays.asList("r","t","l","q"));

        System.out.println(target);
        System.out.println("letters.containsAll(target) = " + letters.containsAll(target));
        System.out.println("letters.removeAll(target) = " + letters.removeAll(target));
        System.out.println(letters);
        System.out.println("letters.removeAll(target) = " + letters.removeAll(target));
        System.out.println(letters);


    }
}
