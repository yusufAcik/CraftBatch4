package day19_Custommethods_Return;

public class C02_PracticeTasks1_Return {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(oddNumbers());
        System.out.println();
        System.out.println("---------------");
        System.out.println(evenNumber());
        System.out.println("-------------------");
        System.out.println(eligibleForAlcoholPurcase(22));
        System.out.println("----------------------");
        System.out.println(eligibleToVote(16, "tr"));
        System.out.println("----------------------");
        System.out.println(grades(78));
        System.out.println(grades(50));
        System.out.println(grades(90));
        System.out.println(grades(67));
        System.out.println("----------------------");
        System.out.println("area of circle "+areaOfCircle(2));
        System.out.println("----------------------");
        System.out.println(areaOfSquare(4));
        System.out.println("----------------------");
        System.out.println(dollarToTl(1500));

    }

//    1. create a method that can return odd numbers between 1~100 in a same line saperated by space

    /**
     * create a method that can return odd numbers between 1~100 in a same line saperated by space
     * @return
     */
    public static String oddNumbers() {
        String result="";
        for (int i = 1; i < 100; i += 2) {
            result+=i+" ";
        }
        return result;
    }

//    2. create a method that can print even numbers between 1~100 in a same line saperated by space

    /**
     * //    2. create a method that can return even numbers between 1~100 in a same line saperated by space
     */


    public static String evenNumber() {
        String result="";
        for (int i = 2; i < 100; i += 2) {
            result+=i+" ";
        }
       return result;
    }

//    3. create a method that can return a boolean if a person is eligible to buy alcohol

    /**
    *   3. create a method that can can return a boolean if a person is eligible to buy alcohol
     * @param age
     * @return
     */

    public static boolean eligibleForAlcoholPurcase(int age) {
        boolean eligible;
        if (21 <= age) {
           eligible=true;
        } else {
eligible = false;
        }
        return eligible;
    }
//    4. create a method that can can return a boolean if a person is eligible to vote

    /**
     * //    4. create a method that can can return a boolean if a person is eligible to vote
     *
     * @param age
     * @param citizenship
     * @return
     */
    public static boolean eligibleToVote(int age, String citizenship) {
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("TR");
        return isEligible;
    }

//    5. create a method that can calculate the grade of the student based on the score
// score >= 90 grade 'A'
// score >= 80 grade 'B'
// score >= 70 grade 'C'
// score >= 60 grade 'D'
// score < 60 grade 'F'

    /**
     * 5. create a method that return the grade of the student based on the score
     * score >= 90 grade 'A'
     * score >= 80 grade 'B'
     * score >= 70 grade 'C'
     * score >= 60 grade 'D'
     * score < 60 grade 'F'
     *@return
     * @param score
     */

    public static char grades(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;

    }

//    6. create a method that can calculate the area of a circle

    /**
     * //    6. create a method that can calculate the area of a circle
     * @param radius
     */
    public static double areaOfCircle(int radius){
        double area;
        area= Math.round(Math.PI*radius*radius*100)/100.0;
        return area;
    }

//    7. create a method that can calculate the area of a square

    /**
     * //    7. create a method that can return the area of a square
     * @param side
     */
    public static double areaOfSquare(int side){
    return side*side;
    }
//    8. create a method that can convert dollar to TL rate:19.04

    /**
     * //    8. create a method that can convert dollar to TL rate:19.04
     * @param dollar
     */
    public static double dollarToTl (double dollar){
        return dollar*19.04;
    }
}