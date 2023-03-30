package day11_ControlFlowStatements_IF;

public class C08_HomeWork {

    public static void main(String[] args) {

        // 3 tane sayıdan büyük olanı veren program
        // 2 ya da 3 farklı yolla çözelim

       /* int a,b,c;
        a=100;
        b=100;
        c=30;
        if((a>=b)&&(a>=c)){
            System.out.println(a);
        }else if((b>=a)&&(b>=c)){
            System.out.println(b);
        }else if((c>=a)&&(c>=b)){
            System.out.println(c);
        }





        System.out.println("max değer: "+
                (Math.max(Math.max(a,b),c)));
        // int first=Math.max(a,b)
        // int max=Math.max(first,c);
*/
        int a,b,c;
        a=10;
        b=10;
        c=30;
         if(a==b){
            System.out.println(a);
        }else if (b==c){
            System.out.println(b);
        }else if(a==c){
            System.out.println(c);
        }else {
            System.out.println("Eşit Sayı Yoktur.");
        }



    }
}
