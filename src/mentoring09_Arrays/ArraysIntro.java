package mentoring09_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int sayi1=4;
        int sayi2=5;
        int sayi3=6;
        int sayi4=7;

        String car1="Honda";
        String car2="Toyota";
        String car3="BMW";
        String car4="Mercedes";

        String []car={"Honda","Toyota","BMW","Mercedes"};

        int sayi [] = {4,5,6,7};

        System.out.println(sayi); // referans verir

        System.out.println(sayi[0]);
        System.out.println(sayi[1]);
        System.out.println(sayi[2]);
        System.out.println(sayi[3]);
        
        // ya da

        for (int i = 0; i < sayi.length; i++) {
            System.out.println(sayi[i]);
        }

        System.out.println(sayi[0]); // 4
      //  System.out.println(sayi[4]); // index out of bounds

        int num [] = new int[4];

    }
}
