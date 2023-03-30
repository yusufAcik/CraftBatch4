package day15_If_Else_Switch_Loops_Summary;

public class C01_If_Else {
    public static void main(String[] args) {

       // kullanıcının girdiği sayı tek mi çift mi

        int x=101;
        if(x%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");
        }

        //  + - veya 0 mı

        int y=-5;
        if(y>0){
            System.out.println("pozitif");
        }else if(y<0){
            System.out.println("negatif");
        }else{
            System.out.println("sıfır");
        }

        // tek sonucu kontrol if, 2 sonuç if - else, 3 ve daha fazla sonu. if-else if- .... - else
        // switch case daha hızlı direkt hedefe gider
        // else if her şartı kontrol ettiği için daha yavaş

    }

}
