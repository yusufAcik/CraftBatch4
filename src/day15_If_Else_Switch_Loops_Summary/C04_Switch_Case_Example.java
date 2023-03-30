package day15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case_Example {

    public static void main(String[] args) {
        // byte,short,int,char,String değerleri
        // SWITCH ile karşılaştırabiliriz

     /*   int x=5;
        switch (x){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                // içerir if bloğu vs koyabiliriz
                break;
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("F");
                break;
            default:
                System.out.println("G");
        }


      */

        // et menü,sebze menü, çocuk menü (1,2,3)
        // et menü- pirzola 50 tavuk 30
        // sebze menü- enginar30, roka salatası 40
        // çocuk menü - patates kızartması 10, makarna 5 tl


        Scanner scan = new Scanner(System.in);
        System.out.println("et menü,sebze menü (1,2): ");
        int tercih1 = scan.nextInt();

        switch (tercih1) {
            case 1:
                System.out.print("pirzola mı(1), tavuk mu(2)");
                int tercih2 = scan.nextInt();
                switch (tercih2) {
                    case 1:
                        System.out.println("pirzola 50 tl");
                        break;
                    case 2:
                        System.out.println("tavuk 30 tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;

            case 2:
                System.out.print("enginar mı(1), roka salatası mı (2)");
                int tercih3 = scan.nextInt();
                switch (tercih3) {
                    case 1:
                        System.out.println("enginar 30 tl");
                        break;
                    case 2:   // case 2,3,4,5: yazabiliriz
                        System.out.println("roka salatası 40 tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;

            default:
                System.out.println("hatalı giriş");


        }
    }
}
