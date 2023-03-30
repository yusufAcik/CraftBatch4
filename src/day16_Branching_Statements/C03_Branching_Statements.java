package day16_Branching_Statements;

import java.util.Scanner;

public class C03_Branching_Statements {
    public static void main(String[] args) {

       outerLoop: for (int i = 0; i < 5; i++) {
            System.out.println("A");
            innerLoop:for (int j = 0; j < 5; j++) {
                if(j==2){
                    break outerLoop;
                }
                System.out.println("B");
            }
        }
        System.out.println();
        System.out.print("--------------");
        System.out.println();

       yusuf: for (int k = 0; k < 3; k++) {
            System.out.print("A");
            emre: for (int l = 0; l < 5; l++) {
                System.out.print("B");
               mehlika: for (int m = 0; m < 10; m++) {
                    System.out.print("C");
                    if(m==0){
                        continue yusuf;
                    }
                }
            }

        }





    }
}
