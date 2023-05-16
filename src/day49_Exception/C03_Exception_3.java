package day49_Exception;

public class C03_Exception_3 {

    public static void main(String[] args) {

        String [] arr ={"Ali","Veli","Deli"};

        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("Hata: "+e.getMessage());
        }

        System.out.println("kod devam ediyor");
    }
}
