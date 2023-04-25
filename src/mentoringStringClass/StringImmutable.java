package mentoringStringClass;

public class StringImmutable {
    public static void main(String[] args) {
        int a=5;
        int b=a;
        a=7;
        System.out.println(a); // 7
        System.out.println(b); // 5

        String s1="Value";
        String s2=s1;
        s1="Value2";

        System.out.println(s1); // Value2
        System.out.println(s2); // Value
    }
}
