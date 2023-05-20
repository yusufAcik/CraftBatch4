package day51_Collection2_2;

import java.util.*;

public class C01_ListPalindrom {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("kaşık","ses","adanada","kazak","radar","ses","yusuf","ses"));

       // System.out.println(findPalindromeInList(list));
        System.out.println("findPalindromeInList2(list) = " + findPalindromeInList2(list));

        // List- yinelenen verileri kabul eder; Set kabul etmez.
        // List- ekleme sırasını korur; set korumaz.
        // List in indexi var; Set in yok

    }
    public static String findPalindromeInList (List<String> list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            String reverse="";
            for (int j = str.length()-1; 0<=j; j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                result+=str+" ";
                list.removeAll(Arrays.asList(str));
                i--;
            }
        }
        return result;
    }

    public static Set findPalindromeInList2 (List<String> list){
        Set<String> result = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            String reverse="";
            for (int j = str.length()-1; 0<=j; j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                result.add(reverse);
            }
        }
        return result;
    }

}

//list içerisinde bulunan palindrom (terside kendisi ile ayni olan kelimeler)
// kelimeleri ekrana yazdıran metodu yazınız.
//kaşık,adanada,kazak,radar,ses,harun
//adanada,kazak,radar,ses

//list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
// metodu yazınız.(aynı kelimeleri ekrana yazma-sın)
