package day35_Arrays_Summary;

public class ArraysSummary_2 {

    public static void main(String[] args) {

        String str="Merhaba";
        String[] strArray=str.split("a");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
