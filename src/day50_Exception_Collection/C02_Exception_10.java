package day50_Exception_Collection;

public class C02_Exception_10 {
    public static void main(String[] args) throws InterruptedException{

        for (int i = 0; i < 10; i++) {
          Thread.sleep(1000); // kodu uyutmak için kullanılır
            // yavaş giden işlemlerde programa zaman kazandırmak için
            System.out.print(i+" ");
        }
    }
}
