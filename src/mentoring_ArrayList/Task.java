package mentoring_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {


    public static void main(String[] args) {

        ArrayList<Integer> integers=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers");

        for (int i = 0; i < 10; i++) {
            integers.add(scan.nextInt());
        }

        Integer in = integers.get(0);
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        uniqueElements.add(integers.get(0));
        for (int i = 0; i < integers.size(); i++) {
            if(integers.get(i)!=in){
                uniqueElements.add(integers.get(i));
                in=integers.get(i);
            }
        }
        Collections.sort(uniqueElements);
        System.out.println("uniqueElements = " + uniqueElements);
    }

    // Create a list of unique elements taken from the user sort and print
    //
    //Example1
    //enter 10 integers: 1 8 9 2 6 6 1 3 5 5
    //your unique sorted elements: [1,2,3,5,6,8,9]
    //
    //enter 10 integers: 1 1 1 1 1 1 1 1 1 2
    //your unique sorted elements: [1,2]
    //
    //
    //Enter 5 String: Kraft Kraft Tech Tech Kraft
    //your unique sorted elements: [Kraft, Tech]
}
