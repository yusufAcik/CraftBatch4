package mentoring09_Arrays;

public class ArraysDataTypes {
    public static void main(String[] args) {
        int [] dizi1 = new int[5];
        String [] dizi2= new String[6];
        boolean [] dizi3= new boolean[3];
        double [] dizi4= new double[4];

        dizi2[3]="Emine"; // 4. elemente atama yaptık


        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i]+"-");
        }
        System.out.println();

        for (int i = 0; i < dizi2.length; i++) {
            System.out.print(dizi2[i]+"-");
        }

        System.out.println();

        for (int i = 0; i < dizi3.length; i++) {
            System.out.print(dizi3[i]+"-");
        }

        System.out.println();

        for (int i = 0; i < dizi4.length; i++) {
            System.out.print(dizi4[i]+"-");
        }
        System.out.println();

        System.out.println("dizi1.length = " + dizi1.length);
    }
}
