package day51_Collection_List;

import java.util.*;

public class C05_SetPractice3 {
    public static void main(String[] args) {
        String [] arr = {"Book","Book","NoteBook","Pen","Pencil","Pen","Spoon","Ruler","Phone","Mirror","Phone","Brush"};

        Set<String> uniqueItemsInMyBag = new HashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemsInMyBag = " + uniqueItemsInMyBag);

        Set<String> uniqueItemsInMyBag2 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemsInMyBag2 = " + uniqueItemsInMyBag2);

        Set<String> uniqueItemsInMyBag3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemsInMyBag3 = " + uniqueItemsInMyBag3);



    }
}
