package day19_Custommethods_Return;

public class C09_Tasks2 {
    public static void main(String[] args) {
        System.out.println("digitsOfNumber(349865) = " + digitsOfNumber(349865));
        System.out.println("-----------------");
        System.out.println("mathPow(3,4) = " + mathPow(3, 4));
        System.out.println("-----------------");
        armstrong();
    }


    // kullanıcıdan alınan sayının kaç basamaklı olduğunu bulalım

    public static int digitsOfNumber(int num){
        int digits=0;
        while (num>0){
            num/=10;
            digits++;
        }
        return digits;
    }

    public static int mathPow(int base, int power){
        int result=1;
        for (int i = 1; i <= power ; i++) {
            result*=base;
        }
        return result;
    }

    public static void armstrong(){
        for (int i =100; i < 1000 ; i++) {
            int birler = i%10;
            int onlar=(i/10)%10;
            int yuzler=i/100;
            int result = birler*birler*birler+onlar*onlar*onlar+yuzler*yuzler*yuzler;
            if (i==result){
                System.out.print(i+" ");
            }
        }

    }
}
