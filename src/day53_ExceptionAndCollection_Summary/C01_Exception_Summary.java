package day53_ExceptionAndCollection_Summary;

public class C01_Exception_Summary {

    public static void main(String[] args) {

        /*
        Uncehecked exception = compile esnasında uyarı vermez runtime da verir.
        Checked exception    = compile esnasında hata verir; derlemeye izin vermez.
         */

        /* Mülakatlarda 3 tane exception; 3 tane error ismi sorarlar*/

        System.out.println("Program çalıştı");
        try {
            System.out.println(5/0);   // uncehecked exception
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
        System.out.println("---------------------");
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(5 / 0);
            System.out.println(3);
        }catch (ArithmeticException ae){
            System.out.println(4);
        }catch (Exception e){
            System.out.println(5);
        }finally {
            System.out.println(6);
        }
        System.out.println(7);
        // 1-2-4-6-7 çalışır (catch lerden sadece birine girer)

        System.out.println("---------------------");
        System.out.println(1);
        try {
            System.out.println(2);
            String  str = null;
            System.out.println(str.length());
            System.out.println(3);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException ae){
            // is A ilişkisi olmayan classların exception larını tek | ve tek isimde birleştirebiliriz
            System.out.println(4);
        }catch (Exception e){
            System.out.println(5);
        }finally {
            System.out.println(6);
        }
        System.out.println(7);

        // 1-2-5-6-7 çalışır

        System.out.println("-------------------");

        try {

        }finally {              // bu yapıyla exception handle etmiş olmayız
                        // hata alındığında programdan çıkılmasını sağlar
        }

        int x=5;
        int y=10;
        if(y-x==5){
            throw new IndexOutOfBoundsException("sonuç 5 olamaz hata var");
        }

        e(10,15);

    }

    public static void a() throws InterruptedException {
        Thread.sleep(3000);  // checked exception
    }

    public static void b() throws InterruptedException {
        a();
    }

    public static void d() {
       try {
           b();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public static void c() {
        d();
    }

    public static void e (int x,int y){
        if(y-x==5){
            throw new IndexOutOfBoundsException("sonuç 5 olamaz hata var");
            // throw clause yaptık   --- throws clause daha farklı : exception u handle etmeden
            //                              deklare edip problemli metodu kullanacak kısıma havale etmek
        }
    }


}
