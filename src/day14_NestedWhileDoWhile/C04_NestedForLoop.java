package day14_NestedWhileDoWhile;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /*  111111
            111111
            111111
            111111
            111111
            111111  konsola iç içe for kullanarak yazdıralım

         */
        for(int i=1; i<=6;i++){
            for (int j=1; j<=6; j++){
                System.out.print(1);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------");

        for(int i=1; i<=6;i++){
            for (int j=1; j<=6; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------");

        /*  *
            **
            ***
            ****
            *****
            ****** yazdıralım  */


        for (int i=1; i<=6; i++){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------");


         /* ******
            *****
            ****
            ***
            **
            *   yazdıralım
            *
                */

        for (int i=6; 0<=i; i--){
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------");

        /* 1
           12
           123
           1234
           12345
           123456 */

        for (int i=1; i<=6; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------");

        /*  1
            22
            333
            4444
            55555
            666666
         */

        for (int i=1; i<=6; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------");

        /*  1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15 */

        for (int i=1, k=1 ; i<=5; i++){
            for (int j= 1; j<=i  ;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------");

        /*       *
                * *
               * * *
              * * * *
    *        * * * * *
            * * * * * *

         */

        for(int i=1; i<=6; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("  *  ");
            }System.out.println();
        }


    }
}
