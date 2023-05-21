package day53_ExceptionAndCollection_Summary;

import java.util.*;

public class C06_Example {

    public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.addAll(Arrays.asList("ali","adanada","veli","kazak","ses","yusuf","radar"));
polindrome(list);
    }

    public static void polindrome(List<String> list){
        Set<String> resultSet = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equalsIgnoreCase(reverse(list.get(i)))){
                resultSet.add(list.get(i));
            }
        }
        for (String str:resultSet){
            System.out.print(str+" ");
        }
    }

    public static String reverse (String str){
        try {
            String result="";
            for (int i = str.length()-1; i >=0 ; i--) {
                result+=str.charAt(i);
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
