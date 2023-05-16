package day49_Exception;

public class C06_Exception_6 {

    public static void main(String[] args) {

        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println("3");
        }finally {
            System.out.println("4");
            // finally bloğu her durum ve şartta çalışır
        }
        System.out.println("5");

        System.out.println("**********");

        System.out.println("1");
        try {
            System.out.println("2");
        }catch (Exception e){
            System.out.println("3");
        }finally {
            System.out.println("4");
            // finally bloğu her durum ve şartta çalışır
        }
        System.out.println("5");

        System.out.println("------------------");

        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println(5/0);
        }finally {
            System.out.println("4");
            // finally bloğu her durum ve şartta çalışır
        }
        System.out.println("5"); // catch bloğunda hata olduğu
        // için "5" çalışmaz ama finally bloğundaki 4 çalışır
    }
}
