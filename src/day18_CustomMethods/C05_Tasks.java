package day18_CustomMethods;

public class C05_Tasks {
    public static void main(String[] args) {

        ageOfPerson(1977);
        System.out.println("------------------");
        usluSayiOlusturma(3,3);
        System.out.println("-------------------");
        sum(7,7);
        System.out.println("--------------------");
        aritmeticOperators(5,7,'*');

    }

    /**
     * a method that shows your age if enter birth year
     * @param birthYear
     */
    public static void ageOfPerson(int birthYear ){
        System.out.println("Yaşınız: "+(2023-birthYear));
    }

    /**
     * a method that receives x and y and duplicate y, x times
     * @param us
     * @param taban
     */
    public static void usluSayiOlusturma(int us,int taban){
        int sonuc = taban;
        for (int i = 1; i <=us ; i++) {
            sonuc *= taban;
        }
        System.out.println(taban+" üzeri "+us+" = "+sonuc);
    }

    /**
     * a method that sums the given 2 numbers
     * @param num1
     * @param num2
     */
    public static void sum(int num1, int num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }

    /**
     * a method that works artimetic operators
     * @param num1
     * @param num2
     * @param operator
     */
    public static void aritmeticOperators(double num1, double num2, char operator){

        switch (operator){
            case '+' :
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case '-' :
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case '*' :
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case '/' :
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }
    }
}
