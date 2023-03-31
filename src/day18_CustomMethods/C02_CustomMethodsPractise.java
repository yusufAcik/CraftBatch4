package day18_CustomMethods;

public class C02_CustomMethodsPractise {

    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("------------------");
        System.out.println();
        countDownTenToZero();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        evenNumber();
    }

    /**
     * a function that can print hello world 5 times
     */
    public static void helloWorld5Times(){
        for (int i = 1; i <=5 ; i++)
            System.out.println("Hello World!"); // buraya kadar 5 kez yazdırır (for ile)
           // System.out.println("Hello World!"); // +1 yazdırır
           // System.out.println("Hello World!"); // +1 yazdırır

    }

    /**
     * a function that print Ten to Zero
     */
    public static void countDownTenToZero(){
        for (int i = 10; i >=0 ; i--) {
            System.out.print(i+" ");
        }
    }

    /**
     * a function that can print all the even numbers from 1 ~ 100
     */
    private static void evenNumber(){
        for(int i=2;i<=100;i+=2)
            System.out.print(i+" ");
    }

}

//     a function that can print hello world 5 times ==> helloWorld5Times()
//     a function that print Ten to Zero  ==> countdownTenToZero()
//     a function that can print all the even numbers from 1 ~ 100 ==> evenNumbers
