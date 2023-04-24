package day31_Arrays_1;

public class C03_Array_2 {

    public static void main(String[] args) {

        int array[]=new int[5];
        array[0]=105;
        array[1]=89;
        array[2]=63;
        array[3]=56;
        array[4]=107;

        // System.out.println(k); // referans verir

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("-------------------");

        // foreach döngüsü array deki tüm verileri dolaşmak istiyorsak kullanılır

        for (int x:array) {
            System.out.print(x+" ");
        }

        System.out.println();

        // array deki çift sayılar

        int count=0;
        for (int x:array) {
            if(x%2==0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println();

        // tek sayılar

        int count1=0;
        for (int x:array) {
            if(x%2==1){
                count1++;
            }
        }
        System.out.print(count1);
        System.out.println();

        // array in içindeki tüm verileri toplayıp ekrana yazdıran for each

        int toplam=0;
        for (int i = 0; i < array.length; i++) {
            toplam+=array[i];
        }

        System.out.println(toplam);

        int arraytoplam=0;
        for (int x:array) {
            arraytoplam+=x;
        }
        System.out.println(arraytoplam);

    }

    public static String[] arrayMethod(){
        String [] array={"yusuf","ali"};
        return array;
    }
    public static String arrayMethod2(String[]arr){
        String [] array={"yusuf","ali"};
        return arr[0];
    }


}
