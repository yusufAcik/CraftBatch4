package day10_UnaryLogicalOperatorsAndReview;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz: ");
        String name = scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz: ");
        int age = scan.nextInt();

        boolean isEligibleToBuyCigarettes = age>=21;

        System.out.println(name+" is eligible to buy cigarettes: "+isEligibleToBuyCigarettes);



    }
}
