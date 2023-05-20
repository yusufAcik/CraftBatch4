package day51_Collection_List;

import java.util.*;

public class C03_List {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        // arrayList in get() i linkedlistten hızlı
        list1.addAll(Arrays.asList(5,10,15,20,25));

        list1.add(5);
        System.out.println(list1);
        System.out.println("list1.get(3) = " + list1.get(3));

        List<Integer> list2 = new LinkedList<>();
        // linkedList in add() ve remove() ı arrayList ten hızlı
        list2.addAll(Arrays.asList(5,10,15,20,25));
        list2.add(5);
        list2.add(9);
        list2.remove(list2.indexOf(9));
        System.out.println(list2);
        System.out.println("list2.get(3) = " + list2.get(3));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list3.get(2));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list4.get(2));

        System.out.println("--------------");
        System.out.println("list4 = " + list4);
        System.out.println("((Stack)list4).pop() = " + ((Stack) list4).pop());
        // stack metodlarına erişebilmek için downCasting yaptık
        System.out.println(list4);
        System.out.println("((Stack)list4).push(60) = " + ((Stack) list4).push(60));
        System.out.println("list4 = " + list4);
        System.out.println("((Stack)list4).peek() = " + ((Stack) list4).peek());
        // listenin en üstündeki (en son giren) elemanı bulur
        System.out.println("list4 = " + list4);
        System.out.println("((Stack<Integer>) list4).peek() = " + ((Stack<Integer>) list4).peek());
        // list4.peek deyince otomatik downcasting yaptı

    }

}
