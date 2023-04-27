package day35_Arrays_Summary;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] str1=new String[3][2];
        // test esnasında excel sayfaları için kullanılacak

        String [][] str=new String[3][2];
        str[0][0]="ali";
        str[0][1]="veli";
        str[1][0]="mehmet";
        str[1][1]="ahmet";
        str[2][0]="isa";
        str[2][1]="musa";

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();
        }



    }
}
