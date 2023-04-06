package methods;

public class MethodsCont {
    public static void main(String[] args) {

        System.out.println(add(5, 7));

        System.out.println(oddOrEven(67));

    }

    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static String oddOrEven(int n){
        String str="";
        if(n%2==0){
            str=n+" is an Even Number";
        }else{
            str= n+" is an Odd Number";
        }
        return str;
    }

}
