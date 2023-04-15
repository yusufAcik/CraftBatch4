package day29_FullReview;

public class C02_CustomMethodsReturn {

    public static void main(String[] args) {
        System.out.println("isEven(5) = " + isEven(5));
        System.out.println("isEven2(5) = " + isEven2(5));
        System.out.println("ageOfPerson(1945) = " + ageOfPerson(1945));
        System.out.println("printNumbers(10,20) = " + printNumbers(10, 20));
    }

    public static boolean isEven (int num){
        if(num%2==0){
           return true;
        }
        return false;
    }

    // ternary ile daha sade
    public static boolean isEven2 (int num){
        return num%2==0? true : false;
    }

    public static int ageOfPerson (int birthYear){
        return 2023-birthYear;

    }

    public static String printNumbers (int x, int y){
        String result="";
        for (int i = x+1; i <y ; i++) {
            result+=i+" ";
        }
        return result;
    }
}
