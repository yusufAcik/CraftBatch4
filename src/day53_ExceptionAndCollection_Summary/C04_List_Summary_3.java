package day53_ExceptionAndCollection_Summary;

import java.util.LinkedList;
import java.util.Queue;

public class C04_List_Summary_3 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        // queue de ilk giren ilk çıkar
        queue.add("ali");
        queue.add("veli");
        queue.add("ahmet");
        queue.add("mehmet");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.offer("can"));
        System.out.println(queue);
    }
}
