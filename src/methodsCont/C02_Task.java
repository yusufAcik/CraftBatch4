package methodsCont;

public class C02_Task {

    public static void main(String[] args) {

        printPrimeBetween(1,55);
        System.out.println();
        System.out.println("----------------");
        System.out.println(addPrimeBetween(1, 10));

    }

    // write a program that print prime number between 1-50

    public static boolean isPrime (int n){
        for (int i = 2; i <=n/2 ; i++)
            if (n%i==0)
                return false;
            if (n<=2) return false;
            return true;
    }

    public static void printPrimeBetween(int start, int end){
        for (int i = start; i <=end ; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    // belirli aralıktaki asal sayıları toplama

    public static int addPrimeBetween (int start, int end){
        int result=0;
        for (int i = start; i <=end ; i++) {
            if (isPrime(i))
                result+=i;
        }
        return result;
    }
}
