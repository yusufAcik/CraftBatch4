package day15_If_Else_Switch_Loops_Summary;

public class C09_Nested_Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("A");
            for (int j = 0; j < 2; j++) {
                System.out.print("B");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 1, k=1; i<=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }
}
