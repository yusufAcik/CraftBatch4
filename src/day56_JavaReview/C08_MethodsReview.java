package day56_JavaReview;

public class C08_MethodsReview {
    public static void main(String[] args) {

        String str1="Disaster";
        printEach(str1);
        System.out.println("--------------------");
        int[] arr = {1,2,3,4,5,};
        printEach(arr);

    }

    public static void printEach(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printEach (String[] arr){
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void printEach (int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void printEach (char[] arr){
        for (char c : arr) {
            System.out.println(c);
        }
    }
}
