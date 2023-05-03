package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println("list.size() = " + list.size()); // 0 verir

        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(10);


        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(list);  // başka arrayList in bütün elemanlarını içine attık

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,3,3,3,3,3,2,2,2,2,2,1,1,1,1,1)); // array i collectiona dönüştürdü


        System.out.println("list3 = " + list3);

        System.out.println("---------------------------");

        list3.removeAll(Arrays.asList(1,2,3));
        System.out.println("list3 = " + list3);

        System.out.println("------------------------");

        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,3,3,3,3,3,2,2,2,2,2,1,1,1,1,1));
        System.out.println("list3 = " + list3);

        System.out.println("-----------------------------");

        list3.retainAll(Arrays.asList(1,2,3));
        System.out.println("list3 = " + list3);


        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","Full Stack Automation Engineer","Java Developer",
                "SDET","Software Development Engineer In Test","Test Engineer",
                "Quality Assurance Engineer","QA Automation Engineer"));
        System.out.println("jobTitles = " + jobTitles);


    }
}
