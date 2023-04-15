package day29_FullReview;

public class C01_CustomMethodsVoid {

    public static void main(String[] args) {
        oddOrEven(5);
        ageOfPerson(1945);
        printNumbers(10,20);
    }

    public static void oddOrEven (int num){
        if(num%2==0){
            System.out.println(num+" is an Even number");
        }else {
            System.out.println(num+" is an Odd number");
        }
    }
    public static void ageOfPerson (int birthYear){
        int age=2023-birthYear;
        System.out.println("Your age is "+age);
    }
    
    public static void printNumbers (int x, int y){
        for (int i = x+1; i <y ; i++) {
            System.out.print(i+" ");
        }
    }

}

// create a function that can check if a number is odd or even number
// create a function that can display the age of the person
// create a function that can print  all the numbers between X and Y

