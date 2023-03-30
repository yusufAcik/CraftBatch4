package LogicalOperators_IfStatements;

public class IfStatements {

    public static void main(String[] args) {

        /*
        if(condition){
        // code
        //
        }else{
        // code}


        int x=28;
        if (x>10 && x<=20)
            System.out.println("hello"); // hello yazmaz
            System.out.println("bye");     // bye yazar

*/
       /* int x=8;
        int y=7;
        if(x>y)
            System.out.println(x);
            System.out.println("thank you");
        else        // if bloğunda birden fazla statement eleman varsa
        System.out.println(y); // else hata verir {} ister
*/

        int x = 98;
        int y = 11;
        int z = 90;

        if(x>y && x>z){
            System.out.println(x);
        }else if(y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }



    }
}
