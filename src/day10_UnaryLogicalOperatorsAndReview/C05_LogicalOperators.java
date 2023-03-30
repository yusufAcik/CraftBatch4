package day10_UnaryLogicalOperatorsAndReview;

public class C05_LogicalOperators {

    public static void main(String[] args) {

        String name = "Ayşe";
        int age = 34;
        String citizen = "Turkey";

        // 18+, turkish

        boolean isEligibleToVote = age>=18 && citizen == "Turkey";
        //                          34>=18 && "Turkey" == "Turkey"
        //                          true && true

        System.out.println(name+" is eligible to vote: "+isEligibleToVote);

        System.out.println("========================");

        String name2= "Umit";
        int findexScore = 800;
        int age2 = 43;
        int income = 40000;

        boolean isEligibleForLoan = findexScore>=1500 && age2>=18 && income > 30000;

        System.out.println(name2+ " is eligible for loan: "+isEligibleForLoan);

        System.out.println("=============================");

        String name3 = "Hatice";
        int age3 = 21;
        char gender = 'F'; // female or male

        boolean isEligible = age3>=18 && (gender == 'M' || gender == 'F');
        //                      true && (false || true)
        //                      true && true
        //                          true

        System.out.println(name3+" is eligible to be selected as MP: "+isEligible);

        System.out.println("=============================");

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 15000;

        boolean isEligibleForScolarShip = gpa>=3.5 || familyIncome <= 20000;
        //                                2.5>=3.5 || 15000<=20000
        //                                  false  || true
        //                                       true

        System.out.println(student+" is eligible for scolarship: "+isEligibleForScolarShip);

        System.out.println("=======================");

        boolean result = true;
        System.out.println("result = "+result);

        boolean result1 = !result; // false
        System.out.println("result1 = " + result1);

        System.out.println("====================");

        int score = 55;

        boolean isPassed = score >=60; // false
        System.out.println("isPassed = " + isPassed);

        boolean failed = !isPassed; // true
        System.out.println("failed = " + failed);


    }
}
