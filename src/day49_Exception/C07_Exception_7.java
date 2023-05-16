package day49_Exception;

public class C07_Exception_7 {

    // checked exceptions(compile time exc): kod derlenmez, ele alınarak düzeltilmesi gerekir
    // unchecked exceptions(untime exc): compile de hata vermez isteğe bağlı handle edilir
                          //   runtime da hata alınabilir
    public static void main(String[] args) {

    //    System.out.println(5/0);  // unchecked exception


        System.out.println(metod(null));


    }

    public static String metod(String str){
        try {
            String result="";
            for (int i = str.length()-3; i <  str.length(); i++) {
                result+=str.charAt(i);
            }
            return result;
        }catch (Exception e){  // nullpointexception ı handle ettik
            return null;
        }
    }



    public static void normalMetod() throws  InterruptedException{
        check();
    } // check metodunu kullananlara uyarı verdik

    public static void check() throws InterruptedException {

        Thread.sleep(3000);  // interruptedException
    }

    // checked Exception
}
