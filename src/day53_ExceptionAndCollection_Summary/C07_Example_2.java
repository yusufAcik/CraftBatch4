package day53_ExceptionAndCollection_Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Example_2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,2,5,6,9,5,4,8));
        System.out.println(uniqueNumbers(list));
    }

    public static List<Integer> uniqueNumbers(List<Integer> list) {
        int count = list.size();
        List<Integer> resultList =new ArrayList<>();
        while (!list.isEmpty()){
            int deger=list.get(0);
            list.removeAll(Arrays.asList(list.get(0)));
            if(list.size()==count-1){
                resultList.add(deger);
            }
            count=list.size();
        }
    return resultList;
    }
}
