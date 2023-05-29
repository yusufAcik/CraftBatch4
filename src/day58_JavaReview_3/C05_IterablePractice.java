package day58_JavaReview_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C05_IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,3,2,2,2,1,3,4,4,5,6,4,5,2));
        System.out.println("list = " + list);
        // remove all the elements less than 4

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println("list = " + list);
        // index kaydığı için istediğimiz işlemi yapamadık

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,3,2,2,2,1,3,4,4,5,6,4,5,2));
        Iterator<Integer> iter = list2.iterator();

        while (iter.hasNext()){
            if(iter.next()<4){
                iter.remove();
            }
        }
        System.out.println("list2 = " + list2);

        System.out.println("----------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,3,2,2,2,1,3,4,4,5,6,4,5,2));

        //*****************************//

        list3.removeIf(each -> each<4);
        System.out.println("list3 = " + list3);

    }
}
