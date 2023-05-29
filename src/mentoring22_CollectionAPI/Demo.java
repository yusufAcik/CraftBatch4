package mentoring22_CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo {

    public static void main(String[] args) {

        int n = 5;

        int nums[] = new int[5];

        nums[0]=4;

        int nums2[]=new int[7];

        System.out.println(Arrays.toString(nums));

        Collection nums3 = new ArrayList();  // polymorphism -> collection, arraylist gibi davranıyor

        nums3.add(3);
        nums3.add(5);
        nums3.add(7);
        nums3.add(9);

        System.out.println("nums3 = " + nums3);

       // nums3.get(1);  // collection da get yok arraylist te var cast edebiliriz


    }
}
