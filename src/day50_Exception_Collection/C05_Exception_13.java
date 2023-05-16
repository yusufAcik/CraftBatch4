package day50_Exception_Collection;

public class C05_Exception_13 {

    public static void main(String[] args) {

        c();
    }

    static void d(){
        c();
    }

    static void c(){
        try {
            b();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void b() throws Exception {
        a();
    }
    static void a() throws Exception { // throws -> hata fırlattı demek
        throw new Exception("Yusuf hata fırlattı");
        // throw -> hata fırlat demek
    }
}
