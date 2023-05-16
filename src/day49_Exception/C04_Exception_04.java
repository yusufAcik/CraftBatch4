package day49_Exception;

public class C04_Exception_04 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(faktoriyel(-3));

        System.out.println("--------------");

        System.out.println("0");
        try {
            System.out.println("1");
            System.out.println(5/0);
            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");
        }catch (Exception e){
            System.out.println("6");
        }
        System.out.println("7");

        System.out.println("--------------------");

        System.out.println("0");
        try {
            System.out.println("1");

            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");
        }catch (Exception e){
            System.out.println("6");
          //  System.out.println(5/0);
        }
        System.out.println("7");

        // exception bloğundaki hatayı yakalayacak mekanizma
        // olmadığı için kod hata verir
        // bunu önlemek için iç içe try catch yaparız

        System.out.println("---------------------");

        System.out.println("0");
        try {
            System.out.println("1");

            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");
        }catch (Exception e){
            try {
                System.out.println("6");
                System.out.println(5/0);
            }catch (Exception f){
                System.out.println("7");
            }
            System.out.println("8");

        }



    }

    public static int faktoriyel(int n){

        try {
            int result=1;
            for (int i = 1; i <=n ; i++) {
                result*=i;
            }
            return result;
        }catch (Exception e){
            System.out.println("hata"+e.toString());
           return -1;
        }

    }
}
