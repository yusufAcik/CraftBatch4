package day53_ExceptionAndCollection_Summary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class C03_List_Summary_2 {

    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        LinkedList<String > linkedList = new LinkedList<>();
        arrayList.add("yusuf");
        linkedList.add("yusuf");
        arrayList.add("ali");
        linkedList.add("ali");
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(arrayList.get(1));
        System.out.println(linkedList.get(1));

        System.out.println("--------------------");

        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.capacity());
        stack.add(25);
        stack.add(50);
        stack.add(75);
        System.out.println(stack.firstElement());
        System.out.println(stack.elementAt(1));
        System.out.println(stack);
        stack.push(80);
        System.out.println(stack);
        stack.peek();
        stack.pop();
        System.out.println(stack);

    }
}
