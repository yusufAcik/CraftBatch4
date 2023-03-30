package day10_UnaryLogicalOperatorsAndReview;

public class Tasks {

    public static void main(String[] args) {

        int age = 20;
        String healt = "healty";

        // boolean toBeSoldier = age>=20 && healt == "healty";

       // System.out.println(toBeSoldier);

        boolean toBeSoldier = age==22 && healt=="healty" || age>19 && healt=="poorly";
        System.out.println("toBeSoldier = " + toBeSoldier);

        System.out.println("------------------------");

        boolean x = false;
        boolean y = false;
        boolean z = true;

        x = !y;
        System.out.println("x = " + x);
        z = !x && x==z;
        System.out.println("z = " + z);

        System.out.println("----------------------");

        int i = 2;
        boolean ln = --i==i || i<1;

        System.out.println("ln = " + ln);

        boolean ln1 = i++==i || i<1;

        System.out.println("ln1 = " + ln1);


    }
}
