package day15_If_Else_Switch_Loops_Summary;

public class C07_Examples {

    public static void main(String[] args) {

        // 1-100 çift sayılar

        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }

        System.out.println();

        for (int m = 2; m <=100 ; m+=2) {
            System.out.print(m+" ");
        }

        System.out.println();

        int j =1;
        while (j<=100){
            if(j%2==0){
                System.out.print(j+" ");
            }
            j++;
        }

        System.out.println();
        int k = 2;
        while(k<=100){
            System.out.print(k+" ");
            k=k+2;
        }
        System.out.println();

        int l = 2;
        do{
            System.out.print(l+" ");
            l+=2;
        }while(l<=100);

    }

}
