package day53_ExceptionAndCollection_Summary;

public class C01_Exception_Summary {

    public static void main(String[] args) {

        System.out.println("Program çalıştı");
        try {
            System.out.println(5/0);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
            System.out.println("hata var");
            System.out.println("aritmetic exception hatası");
        }catch (Exception e){
            // birden fazla catch varsa özelden genele doğru yazılır
            e.printStackTrace();
        }catch (Throwable t){
            // genelde kullanılmaz çünkü
            // throwable=errors+exceptions
            // error lar handle edilemez
            // exception ları da üstteki catch de yazdık zaten
            // bu durumda throwable çalışma ihtimali yok
        }

        System.out.println("Program çalışmaya devam ediyor.");
    }
}
