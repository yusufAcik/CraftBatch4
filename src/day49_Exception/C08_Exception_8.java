package day49_Exception;

public class C08_Exception_8 {

    public static void a(){

        b(); // b de ve b nin kullandığı c de sorun olmadığı için
                // hata vermez

    }

    public static void b(){

        c(); // c de hata handle olduğu için hata vermez
      //  d();  // d handle olmadığı için hata verir

    }
    public static void c(){ // handle etme işini c() üstlendi

       try {
           d();
       }catch (Exception e){

       }

    }
    public static void d() throws InterruptedException {  // handle etme işini
                                        // bu metodu kullanacak kişiye pasladık

        Thread.sleep(3000);

    }
}
