package day58_JavaReview_3;

import java.util.*;

public class C04_CollectionReview {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,3,2,1,3,4,5,5,4,3,2,1));
        System.out.println(set);

        Integer[] array = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

      //  List<String> name = null;
      //  System.out.println("name.size() = " + name.size()); NullPointerException

        List<String> group = new Stack<>();
        group.addAll(Arrays.asList("ali","veli","ahmet","mehmet"));
        System.out.println("group = " + group);

       // group.pop();  casting yapmadan kullanamayız

        System.out.println("((Stack) group).pop() = " + ((Stack) group).pop());

        System.out.println("group = " + group);

        System.out.println("---------------------");

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Ayşe","Fatma","Hatice","Zeynep"));

        // names.poll(); casting yapmadan kullanamayız

        System.out.println("((Queue)names).poll() = " + ((Queue) names).poll());
        System.out.println("((LinkedList)names).poll() = " + ((LinkedList) names).poll());

        System.out.println("names = " + names);
    }
}
