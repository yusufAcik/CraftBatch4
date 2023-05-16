package day50_Exception_Collection;

public class C03_Exception_11 {
    public static void main(String[] args) {

        try {
            System.out.println(5/0);
        }catch (ArithmeticException a){
            System.out.println(1);  // catch ler özelden genele doğru sıralanır
                            // aynı statüdeki exceptionlar alt alta sıralanabilir
                    //ama üst düzey exceptionlar altta olmak zorunda
        }catch (Exception e){
            System.out.println(2);
        }
        System.out.println("kod devan ediyor");

        String str=null;
        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(i);
            }
        }catch (ArithmeticException a){
            System.out.println(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(2);
        }
        System.out.println("kod devan ediyor");

        String str1=null;
        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(i);
            }
        }catch (ArithmeticException  | NullPointerException b){
            // aynı düzey exceptionları tek satırda toplayabiliriz
            // is A ya da parent-child ilişkisi olmamalı
            System.out.println(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(2);
        }
        System.out.println("kod devam ediyor");


    }
}
