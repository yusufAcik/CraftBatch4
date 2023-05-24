package day56_JavaReview;

import java.util.Arrays;

public class C07_Anagram {

    public static void main(String[] args) {

        String str1= "kitap";
        String str2= "katip";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars2));

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean isAnagram = chars1.equals(chars2); // arraylerin eşitliğini böyle kontrol edemeyiz
        boolean isAnagram2 = Arrays.equals(chars1,chars2);

        System.out.println("isAnagram2 "+ isAnagram);
        System.out.println("isAnagram2 "+ isAnagram2);



    }

}
