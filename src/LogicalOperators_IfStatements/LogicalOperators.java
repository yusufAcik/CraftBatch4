package LogicalOperators_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        /* logical operators && and || or

                        & - and        | - or

            T ---- T       T            T
            T --- F         F           T
            F ----T         F           T
            F ---- F        F           F

         */
            int x=9;
            int y=7;
            int a=7;
            int b=11;

        //    boolean result=x>y;
        // System.out.println("result = " + result); //true

        boolean result=x>y || a>b; // çift || veya && olduğunda tek tarafı kontrol eder
        System.out.println("result = " + result);
    }
}
