package day51_Collection2_2;

import java.util.*;

public class C02_QueuePractice {

    public static void main(String[] args) {
        Queue<Integer> priorityQue = new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(20,150,200,40,120));
        priorityQue.add(30);
        System.out.println("priorityQue = " + priorityQue);  // random order

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(20,150,200,40,120));
        arrayDeque.add(30);
        System.out.println("arrayDeque = " + arrayDeque);  // preserve insertion order

        System.out.println("------------------");

        Queue<Integer> LinkedList = new LinkedList<>();
        LinkedList.addAll(Arrays.asList(20,150,200,40,120));
        LinkedList.add(30);
        System.out.println("LinkedList = " + LinkedList);     // preserve insertion order

       //  priorityQue.get(1);     // index olmadığı için ulaşamayız
        // arrayDeque.get(2);      // index olmadığı için ulaşamayız

        ((List)LinkedList).get(1);    // list te index var ama ulaşmak için cast yapmak gerekli

        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.poll() = " + priorityQue.poll());
        // first element will be removed
        System.out.println("priorityQue = " + priorityQue);

        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println(arrayDeque);
         System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
         System.out.println(arrayDeque);

        System.out.println("LinkedList.poll() = " + LinkedList.poll());      // First in first out
        // Queue interface özelliği taşıdığı için poll özelliğini kullanır
        System.out.println(LinkedList);

      //  System.out.println("((List)priorityQue).get(1) = " + ((List) priorityQue).get(1));   // runtime error


    }
}
