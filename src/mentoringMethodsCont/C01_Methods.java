package mentoringMethodsCont;

import java.util.Scanner;

public class C01_Methods {
    public static void main(String[] args) {

        System.out.println("Enter your name and age: ");
        System.out.println(getName2()+" "+getAge());

    }

    // Write a method that gets the name of the user
    // Write a method that gets the age of the user

    public static String getName(){
        Scanner input=new Scanner(System.in);

        String name = input.nextLine();

        return name;
    }

    // aynı methodu sade şekilde yapalım

    public static String getName2(){
        return new Scanner(System.in).nextLine();
    }

    public static String getAge(){
        return new Scanner(System.in).nextLine();
    }


}
