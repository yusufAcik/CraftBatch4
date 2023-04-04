package day20_CustomMethods_Overloading;

public class C01_NameOfDay {

    public static void main(String[] args) {

        System.out.println("nameOfDay(9) = " + nameOfDay(9));
        System.out.println("nameOfDay(7) = " + nameOfDay(7));
    }


public static String nameOfDay(int number){
    String result="";
    if(number<1 || number>7) {
        result="Invalid";
    }else if (number==1){
        result="Monday";
    }else if (number==2){
        result="Tuesday";
    }else if (number==3){
        result="Wednesday";
    }else if (number==4){
        result="Thursday";
    }else if (number==5){
        result="Friday";
    }else if (number==6){
        result="Saturday";
    }else {
        result="Sunday";
    }
    return result;
}

}
