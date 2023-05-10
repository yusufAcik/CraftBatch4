package mentoring08_methodsReview;

public class MethodsReview {

    public static void main(String[] args) {

        System.out.println("nthFibonacci(7) = " + nthFibonacci(7));

        System.out.println(fibonacci(7));

        int n=7;
        for (int i=0; i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static long nthFibonacci (int n) {

        long x=0;
        long y=1;
        long z=0;

        for (long i = 0; i <= n-2; i++) {
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }

    public static long fibonacci (int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    // int bir değişkene karşılık gelen fibonacci sayısını
    // veren method
    // dönüş tipi long
}
