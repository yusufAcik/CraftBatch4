package day19_Custommethods_Return;

public class C06_ReturnTheBiggest {

    public static void main(String[] args) {

        int maxNumber= max(20,30);
        System.out.println("max(5,10) = " + max(5, 10));

        // multiply the max number by 3
        int multilplication= maxNumber*3;
        System.out.println(multilplication);
    }

    // a method that returns the biggest number

    public static int max(int a, int b){
        int result=0;
        if (a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }
}
