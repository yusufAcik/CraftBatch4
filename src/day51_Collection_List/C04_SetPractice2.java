package day51_Collection_List;

import java.util.HashSet;
import java.util.Set;

public class C04_SetPractice2 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(10);
        set1.add(15);
        set1.add(15);
        set1.add(15);
        System.out.println(set1); // [5,10,15]
        set1.remove(15); // [5,10]
        System.out.println("set1 = " + set1);


        String str = "saşfS  kjld  ljfş asjşl  aperıup eoıömnx fafaioww   i";
        // str içinde kaç farklı harf var bulalım.

        System.out.println("uniqueLetterCount(str) = " + uniqueLetterCount(str));
    }

    public static int uniqueLetterCount(String str){
        String [] arr = str.replace(" ","").toLowerCase().split("");
        Set<String> uniqueCharSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueCharSet.add(arr[i]);
        }
        return uniqueCharSet.size();

    }
}
