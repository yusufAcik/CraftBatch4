package day50_Exception_Collection;

public class C04_Exception_12 {

    public static void main(String[] args) {

        try {
            System.out.println(5/0);
        }
        finally {
            System.out.println(1);
        }
        System.out.println("kod devam ediyor");

        // finally bloğunu her türlü yazar;
        // catch yapmadığımız için kod devam ediyor yazmaz
    }
}
