package day42_StaticAndInheritage;

public class A {

    public static String staticVariable="yusuf";
    public String normalVariable="ali";

    public static void staticMethod(){
        // normalMethod();
        // normalVariable;  static methodda static olmayan
                         // method ve variable çağırılamaz

        System.out.println("ben bir static methodum");
    }

    public void normalMethod(){
        System.out.println("Ben bir normal methodum");
        staticMethod();
        staticVariable.length();
        // static olmayan methodda static method ve variable ları çağırabiliriz
    }
}
